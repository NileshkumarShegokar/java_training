import java.util.*;
import java.lang.*;

public class Armbet {
    public static void main(String args[])
    {


        int temp1,temp2,n=0,rem=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting value:");
        int s=sc.nextInt();
        System.out.println("enter the ending value:");
        int e=sc.nextInt();

        System.out.println("Armstrong no in between:"+ s + "And" +e);
        for(int i=s;i<=e;i++)
        {
               temp1=i;
               temp2=i;
               while(temp1!=0)
               {
                   temp1=temp1/10;
                   n++;
               }

                 //temp1=i;
               /*while(temp1!=0)
               {
                   rem=temp1%10;
                   sum += Math.pow(rem, n);
                   temp1=temp1/10;
               }*/

            while(temp2!=0)
            {
                rem=temp2%10;
                sum += Math.pow(rem, n);
                temp2=temp2/10;
            }

              if(sum==i)
              {
                  System.out.println(i);
              }

                rem=0;
               sum=0;
               n=0;



        }
    }
}
