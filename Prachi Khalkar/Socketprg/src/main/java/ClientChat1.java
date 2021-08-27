import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat1 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",8089);
        System.out.println("client Connected");
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String s1="",s2="";
        while(!s1.equals("stop")) {
            System.out.println("Enter msg to Server:");
            s1 = sc.nextLine();
            dout.writeUTF(s1);

            s2 = din.readUTF();
            System.out.println("Msg from server:" + s2);


            dout.flush();
        }
           dout.close();
           s.close();



    }

}
