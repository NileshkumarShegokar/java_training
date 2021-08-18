import java.io.*;
import java.util.*;

public class Appendtxt {

    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\user\\IdeaProjects\\xyz.txt");



        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data:");
        String str=sc.nextLine();


            FileWriter fw = new FileWriter(file, true);
            fw.write(str);
            fw.close();






    }



}
