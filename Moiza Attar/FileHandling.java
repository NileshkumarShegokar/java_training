package com.company;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\user\\Desktop\\Myfile.txt");
        myfile.createNewFile();

        FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\Myfile.txt");
        fileWriter.write("Hello!!! \nHow are you?? \nWhat are you doing??");
        fileWriter.flush();
        fileWriter.close();

        Scanner sc = new Scanner(myfile);
        while(sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);

        }
        sc.close();

        }
}
