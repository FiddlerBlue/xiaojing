package com.jing.java;

import java.io.File;
import java.io.IOException;

/**
 * @author Xiaojing
 * @create 10/25/2019
 * @desc Created by Xiaojing at 10:54 PM
 **/
/*
* */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(file.canExecute());
        file.canRead();
        file.canWrite();
        //file.deleteOnExit();
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        //返回文件绝对路径的规范格式
        System.out.println(file.getCanonicalFile());
        System.out.println(File.separator);

        File file2 = new File("c:/a/b/c/d");
      /*  System.out.println(file2.getAbsolutePath());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        String[] list = file2.list();
        for (String str:list){
            System.out.println(list);
        }*/

        System.out.println("-------------------------");
        /*File[] files = file2.listFiles();
        for (File f: files){
            System.out.println(f);
        }*/

        file2.mkdirs();
        /*打印当前文件系统的所有盘符*/
        File[] files1 = File.listRoots();
        for (int i = 0; i < files1.length; i++){
            System.out.println(files1[i]);
        }
    }
}
