import java.io.*;
import java.util.Scanner;

public class Samplefile {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\user\\IdeaProjects\\xyz.txt");


               boolean val=file.createNewFile();
               if(val)
               {
                   System.out.println("the file is created");
               }
               else
               {
                   System.out.println("the file is already exits");
               }


            System.out.println("write file");

           Scanner sc=new Scanner(System.in);
           System.out.println("enter the data:");
           String str=sc.nextLine();

           FileWriter fw=new FileWriter(file);
               fw.write(str);

            System.out.println("data is written into file");

                fw.flush();
                fw.close();


             System.out.println("read file");
               int n=str.length();
             char arr[]=new char[n];

             FileReader fr=new FileReader(file);
             fr.read(arr);
             System.out.println("data in the file:");
             System.out.println(arr);

             fr.close();



    }
}


/*
  .....................Output............................
  the file is already exits
enter the data:
hello this is my first file program
data is written into file
data in the file:
hello this is my first file program

 */