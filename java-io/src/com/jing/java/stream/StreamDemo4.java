package com.jing.java.stream;

import java.io.*;

/**
 * @author Xiaojing
 * @create 10/26/2019
 * @desc Created by Xiaojing at 7:35 PM
 **/
public class StreamDemo4 {
    public static void main(String[] args)  {
        File file = new File ("D:\\Work\\Study\\Architect\\respository\\javase\\aaa.md");
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\Work\\Study\\Architect\\respository\\javase\\readme.md");
            outputStream = new FileOutputStream(file);
            int length = 0;
            //添加缓冲区的方式
            byte[] buffer = new byte[30];
            while ((length = inputStream.read(buffer)) != -1) {
/*                System.out.println(length);
                System.out.println(new String(buffer, 0, length));*/
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
