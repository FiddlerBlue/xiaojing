package com.jing.java;
import java.io.File;

/**
 * @author Xiaojing
 * @create 10/25/2019
 * @desc Created by Xiaojing at 11:31 PM
 **/
public class FileRecursiveDemo {
    public static void main(String[] args) {
        printFile(new File("d:/work"));
    }
    public static void printFile(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files){
                printFile(f);
            }

        }else {
            System.out.println(file.getAbsolutePath());
        }
    }
}
