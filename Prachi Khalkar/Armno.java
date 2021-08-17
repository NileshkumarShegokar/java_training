import java.util.*;
import java.lang.*;

public class Armno {
    public static void main(String args[])
    {
          int temp=0,cnt=0,sum=0,rem=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no:");
        int no=sc.nextInt();

         temp=no;

         while(temp!=0)
         {
             temp=temp/10;
             cnt++;
         }
          System.out.println("cnt is:"+cnt);
           temp=no;

           while(temp!=0)
          {
            rem=temp%10;
              sum += Math.pow(rem, cnt);
              temp=temp/10;

          }


           if(sum==no)
           {
               System.out.println(no+"  is Armstorng no");
           }
           else
           {
               System.out.println(no +" is not Armstorng no");
           }


    }

}
