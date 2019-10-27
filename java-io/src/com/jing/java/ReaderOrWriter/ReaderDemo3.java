package com.jing.java.ReaderOrWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Xiaojing
 * @create 10/27/2019
 * @desc Created by Xiaojing at 10:07 PM
 **/
public class ReaderDemo3 {
    public static void main(String[] args) {
        Reader reader = null;

        try {
            reader = new FileReader("D:\\Work\\Study\\Architect\\respository\\javase\\aaa.md");
            int length = 0;
            char[] buffer = new char[1024];
            while ((length = reader.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, length));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
