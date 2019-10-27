package com.jing.java.ReaderOrWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;

/**
 * @author Xiaojing
 * @create 10/27/2019
 * @desc Created by Xiaojing at 10:07 PM
 **/
public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("D:\\Work\\Study\\Architect\\respository\\javase\\aaa.md");
            int read = reader.read();
            System.out.println((char)read);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
