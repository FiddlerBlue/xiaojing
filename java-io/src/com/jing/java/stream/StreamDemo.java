package com.jing.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

/**
 * @author Xiaojing
 * @create 10/26/2019
 * @desc Created by Xiaojing at 7:35 PM
 **/
public class StreamDemo {
    public static void main(String[] args)  {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\Work\\Study\\Architect\\respository\\javase\\readme.md");
            int read = inputStream.read();
            System.out.println((char)read);
            inputStream.read();
            System.out.println((char)read);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
