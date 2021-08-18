import java.io.*;

public class Renamefile {
    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\user\\IdeaProjects\\old.txt");

              file.createNewFile();

            System.out.println("name of the file is:"+file.getName());

       File filenm=new File("C:\\Users\\user\\IdeaProjects\\new.txt");

              boolean val=file.renameTo(filenm);
              if(val)
              {
                  System.out.println("file name is changed");
              }
              else
              {
                  System.out.println("file name no chnaged");
              }




    }
}
