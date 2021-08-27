package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Sampleprg {

    public static void main(String[] args) throws IOException {
	// write your code here

        File file=new File("C:\\Users\\user\\IdeaProjects\\abc.txt");
        FileWriter fw=new FileWriter(file);

        file.createNewFile();
        System.out.println("file name:"+ file.getName());
        System.out.println("file Absolute add:"+ file.getAbsolutePath());
        System.out.println("CanonicalPath:"+ file.getCanonicalPath());
        System.out.println("parent path:"+ file.getParent());
        fw.write("hello this is the first file program");
        fw.flush();
        fw.close();


        /* byte [] data=new String("file nm:abc").getBytes(StandardCharsets.UTF_8);

         FileOutputStream fos=new FileOutputStream(file);
                fos.write(data);

        fos.flush();
        fos.close();*/





    }
}
