
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class ServerChat1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ssocket=new ServerSocket(8089);
        System.out.println("connection open");
        Socket s=ssocket.accept();
         DataInputStream  din=new DataInputStream(s.getInputStream());
         DataOutputStream dos=new DataOutputStream(s.getOutputStream()) ;
        Scanner sc=new Scanner(System.in);

        String s1="",s2="";
       while(!s1.equals("stop")) {
           s1 = din.readUTF();
           System.out.println("Msg from Client:" + s1);
           System.out.println("Enter msg to client:");
           s2 = sc.nextLine();
           dos.writeUTF(s2);
           dos.flush();
       }
           dos.close();
           ssocket.close();
       }

    }

