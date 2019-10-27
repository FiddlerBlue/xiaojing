package com.jing.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Xiaojing
 * @create 10/26/2019
 * @desc Created by Xiaojing at 7:35 PM
 **/
public class StreamDemo3 {
    public static void main(String[] args)  {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\Work\\Study\\Architect\\respository\\javase\\readme.md");
            int length = 0;
            //添加缓冲区的方式
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(length);
                System.out.println(new String(buffer, 0, length));
            }
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
