
import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class Copyfile {
    public static void main(String[] args) throws IOException{


        String src="C:\\Users\\user\\IdeaProjects\\abc.txt";
        String dest="C:\\Users\\user\\IdeaProjects\\xyz.txt";

        FileInputStream fs =new FileInputStream(src);
        FileOutputStream fd=new FileOutputStream(dest,true) ;

        int c;
        while((c=fs.read())!=-1) {
            fd.write((char) c);
        }
        System.out.println("File is Copied");
            fs.close();
            fd.close();






    }

}
