package com.jing.java.stream;
import java.io.*;

/**
 * @author Xiaojing
 * @create 10/26/2019
 * @desc Created by Xiaojing at 8:50 PM
 **/
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File ("D:\\Work\\Study\\Architect\\respository\\javase\\aaa.md");
        OutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream(file);
            outputStream.write(99);
            outputStream.write("\r\nZhao Xiaojing".getBytes());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                outputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
