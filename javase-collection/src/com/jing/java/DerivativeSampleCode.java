package com.jing.java; /**
 * @author Xiaojing
 * @create 10/24/2019
 * @desc Created by Xiaojing at 12:53 PM
 **/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.siemens.scr.algo.expression.ExpressionToRelation;
import com.siemens.scr.algo.expression.shared.HighLevelExpression;
import com.siemens.scr.frend.Attribute;
import com.siemens.scr.frend.AttributeIdentifier;
import com.siemens.scr.frend.AttributeInfo;
import com.siemens.scr.frend.RelationException;
import com.siemens.scr.frend.TupleIterator;
import com.siemens.scr.frend.ValueRange;
import com.siemens.scr.frend.array.DoubleArray;
import com.siemens.scr.frend.array.LongArray;
import com.siemens.scr.frend.array.ValueArray;
import com.siemens.scr.frend.computation.AttributeFunction;
import com.siemens.scr.frend.computation.module.Module;
import com.siemens.scr.frend.computation.module.ModuleType;
import com.siemens.scr.frend.impl.AttributeName;
import com.siemens.scr.frend.impl.time.archive.ArchiveRelation;
import com.siemens.scr.frend.impl.time.function.TimeFunctionRelation;
import com.siemens.scr.frend.source.archive.ArchiveDataSegment;
import com.siemens.scr.frend.source.impl.file.table.grouping.GroupingTableAttribute;
import com.siemens.scr.frend.source.impl.file.txt.TextFileSource;
import com.siemens.scr.frend.time.TimeRange;
import com.siemens.scr.frend.time.TimeRangeList;
import com.siemens.scr.model.Project;
import com.siemens.scr.model.ProjectSensorIdentifier;
import com.siemens.scr.model.SelectedSensorInfo;
import com.siemens.scr.model.SensorInfo;
import com.siemens.scr.project.ComputedSensorModule;
import com.siemens.scr.project.StateEstimationModule;
import com.siemens.scr.project.Algo.GMMAlgoModule;
import com.siemens.scr.project.Algo.PolynomialAlgoModule;
import com.siemens.scr.project.Algo.SVMAlgoModule;
import com.siemens.scr.project.histogram.gui.HistogramAttribute;
import com.siemens.scr.project.histogram.gui.SimpleArchiveSource;
public class DerivativeSampleCode {
    public static void main(String[] args) throws Exception{

        ModuleType[] moduleTypes = new ModuleType[] {
                StateEstimationModule.MODULE_TYPE,ComputedSensorModule.MODULE_TYPE};
        ModuleType[] supportedAlgoModuleTypes = {      // you cn set among parameters
                GMMAlgoModule.MODULE_TYPE, SVMAlgoModule.MODULE_TYPE,PolynomialAlgoModule.MODULE_TYPE};

        File file = new File("C:\\work\\powermonitor\\CAPClient\\data\\tmptest.txt");

        // static method you need to set the Modulesequencetype
        Project.setModuleTypes((List<? extends ModuleType<?>>) Arrays.<ModuleType>asList(moduleTypes));

        ///////create instance of project/////////////////////////////
        Project project=new Project("",null);
        //BufferedReader br=new BufferedReader(new FileReader(pathCSV));
        TextFileSource textFS=new TextFileSource(file);
        TimeRange tr=textFS.getTotalTimeRange();

        //GroupingTableSource gbl=new GroupingTableSource(pathCSV, cFS.TEXT_FILE_FORMAT);

        TimeFunctionRelation relation=new TimeFunctionRelation(new ArchiveRelation(textFS),0);

        project.setRelation(relation);
        Module module=project.addModule(ComputedSensorModule.MODULE_TYPE);
        ComputedSensorModule csModule=(ComputedSensorModule)module;

        Module module1=project.addModule(StateEstimationModule.MODULE_TYPE);
        StateEstimationModule seModule=(StateEstimationModule)module1;

        project.setRelation(relation);
        ////////////////////////////////////Add sensors//////////////////////////////////////////////////////////
        Collection<GroupingTableAttribute> attrGrp  =(Collection<GroupingTableAttribute>) textFS.getAttributes();
        ArrayList<SelectedSensorInfo> selectInfo=new ArrayList<SelectedSensorInfo>();

        ArrayList<AttributeIdentifier> outputId=new ArrayList<AttributeIdentifier>();
        long id=0;
        int Uid=1;

        for(GroupingTableAttribute g : attrGrp){

            AttributeInfo attrInfo=g.getAttributeInfo();
            AttributeIdentifier a=g.getIdentifier();
            System.out.println(g.getAttributeInfo());
            ///// sensor added to module///////////////////////////////////////////////

            //////////////////////SelectedSensorInfo for project//////////////////////////////////////////
            SelectedSensorInfo s1=new SelectedSensorInfo(g.getName(),a,id);

            s1.setUniqueIdentifier(new ProjectSensorIdentifier(Uid));
            System.out.println(s1.getUniqueIdentifier());
            AttributeIdentifier a1=s1.getUniqueIdentifier();
            selectInfo.add(s1);
            //----- NEW CHANGE ----
            //seModule.addSensorInfo(new SensorInfo(a1));
            //----- NEW CHANGE ----
            //outputId.add(a1);
            id++;
            Uid++;
        }


        project.setSelectedSensors(selectInfo);

        ///////////////////////////////Matrix from the relation///////////////////////////////////////
        TupleIterator tupleIt = relation.iterator();

        int nTs = relation.size();      // number of rows
        int nSensor=relation.getAttributes().size()-1;    //number of columns

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        double [][] data=new double [nSensor][nTs];
        long [] ts=new long[nTs];
        String [] tsStr =new String [nTs];

        Collection<Attribute> allAttr=(Collection<Attribute>) relation.getAttributes();

        int idx=0; //row
        while (tupleIt.next()) {

            int col=0;
            for(Attribute attr : allAttr){
                if(col==0){
                    long t=tupleIt.getValue(attr).longValue();
                    //System.out.println();
                    //tsStr[idx]=str;
                    //System.out.println(str);
                    ts[idx]=t;
                    col++;
                    continue;
                }
                Double value=tupleIt.getValue(attr).doubleValue();
                data[col-1][idx]=value;
                col++;
            }
            idx++;
        }

        long start=ts[0];      // for timerange
        long end=ts[idx-1];    // for timerange

        HashMap<String,Integer> sensorNameIdxMap=new HashMap<String,Integer>();
        int i=0;
        for(Attribute attr: allAttr){
            if(i==0){
                i++;
                continue;
            }
            sensorNameIdxMap.put(attr.getName(),i-1);
            i++;
        }
        ///////////////////////////--------------- construct relation from matrix ----------------//////////////////////////////////////////
        List<SelectedSensorInfo> selectedList=project.getSelectedSensors();


        ArrayList <HistogramAttribute> list=new ArrayList<HistogramAttribute>();
        for(int j=0;j<selectedList.size();j++){
            String projSenName=((AttributeName)(selectedList.get(j).getAttrID())).getName();
            idx=sensorNameIdxMap.get(projSenName);
            if(idx>=0){
                ArchiveDataSegment seg=new ArchiveDataSegment(new LongArray(ts), new ValueArray(new DoubleArray(data[idx])));
                AttributeIdentifier idj=selectedList.get(j).getUniqueIdentifier();
                HistogramAttribute hist=new HistogramAttribute(idj,projSenName,seg);
                list.add(hist);
            }

        }
        SimpleArchiveSource archiveSource=new SimpleArchiveSource(list);
        TimeFunctionRelation relationNew=new TimeFunctionRelation(new ArchiveRelation(archiveSource),0);
        project.setRelation(relationNew);

        //----- NEW CHANGE ----
		/*
		//////////////////////////////////////Create SE module///////////////////////////////////////////
		AttributeIdentifier a=new AttributeName("added_sensor1");
		SelectedSensorInfo s1=new SelectedSensorInfo("added_sensor1",a,id);
		s1.setUniqueIdentifier(new ProjectSensorIdentifier(Uid));
		AttributeIdentifier a1=s1.getUniqueIdentifier();
		//seModule.addSensorInfo(new SensorInfo(a1));

		selectInfo.add(s1);
		project.setSelectedSensors(selectInfo);
		*/
        //----- NEW CHANGE ----

        //project.apply();


        ///////////////////////// high level expression////////////////////////////////////////////////////////////////

        HighLevelExpression highExp = null;
        HighLevelExpression highExp2 = null;
        String assignment = "derived_sensor" + "=" + "Deriv(Sensor1)";

        try {
            highExp = ExpressionToRelation
                    .createHighLevelExpressionFromExpression(
                            assignment, project.getRelation());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        csModule.addHighLevelExpression(highExp);
        project.apply();


        //----- NEW CHANGE ----
		/*
		//////////////////////////////////////Create SE module///////////////////////////////////////////
		AttributeIdentifier a=new AttributeName("added_sensor1");
		SelectedSensorInfo s1=new SelectedSensorInfo("added_sensor1",a,id);
		s1.setUniqueIdentifier(new ProjectSensorIdentifier(Uid));
		AttributeIdentifier a1=s1.getUniqueIdentifier();
		//seModule.addSensorInfo(new SensorInfo(a1));

		selectInfo.add(s1);
		project.setSelectedSensors(selectInfo);
		*/
        String [] sensorNames=new String[selectedList.size()+1];
        for(int j=0;j<selectedList.size();j++){
            String projSenName=((AttributeName)(selectedList.get(j).getAttrID())).getName();
            sensorNames[j]=projSenName;
        }
        sensorNames[sensorNames.length-1]="added_sensor1";

        ArrayList<Attribute> attrs = (ArrayList<Attribute>) project.getAttributeForSensorPanel();
        for (i = 0; i < sensorNames.length; i++) {
            Attribute attr = null;
            for (int j = 0; j < attrs.size(); j++) {
                attr = attrs.get(j);
                if (attr.getName().equalsIgnoreCase(sensorNames[i])){
                    break;
                }
            }
            SensorInfo senInfo = new SensorInfo(attr, project.getUserSettings());
            seModule.addSensorInfo(senInfo);
            System.out.println(attr.getName());
        }

        //----- NEW CHANGE ----


        //////////////////////////////////////////////////////////////

        project.apply();
        TimeRange tmr=new TimeRange(start,end);
        TimeRangeList trainingTime = new TimeRangeList(tmr);
        seModule.setTrainingTime(trainingTime);
        seModule.train(relationNew);
        //System.out.println("Ankkky");

        for(Object obj : project.getModules()){
            Module module2=(Module)obj;
            Collection<? extends AttributeFunction> functions=module2.getFunctions();
            if(functions!=null){

                for (AttributeFunction function :functions){
                    Collection<? extends AttributeInfo> attrInfos=function.getOutputAttrInfos();
                    for(AttributeInfo info:attrInfos){
                        outputId.add(info.getIdentifier());
                        //outputSensorNames.add(info.getName());
                    }

                }
            }
        }


        Collection<Attribute> allAttr2 = (Collection<Attribute>) relationNew
                .getAttributes();

        for(Attribute att: allAttr2) {
            System.out.print(att.getName());
            System.out.print("		");

        }
        System.out.println();

        TupleIterator tupleIt2 = relationNew.iterator();

        int nTs2 = relationNew.size(); // number of rows
        int nSensor2 = relationNew.getAttributes().size() - 1;
        double[][] data2 = new double[nSensor2][nTs2];
        long[] ts2 = new long[nTs2];

        int idx2 = 0;
        while (tupleIt2.next()) {

            int col = 0;
            for (Attribute attr : allAttr2) {
                if (col == 0) {
                    long t = tupleIt2.getValue(attr).longValue();
                    ts2[idx2] = t;
                    col++;
                    System.out.print(t+"           ");
                    continue;
                }
                Double value = tupleIt2.getValue(attr).doubleValue();
                System.out.print(value);
                data2[col - 1][idx2] = value;
                col++;
                System.out.print("		");
            }
            idx2++;
            System.out.println();
        }

        //System.out.println("Congratulations!!!!");
    }
}
