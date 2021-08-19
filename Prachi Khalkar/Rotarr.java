import java.io.*;
import java.util.*;

public class Rotarr
{
    public static void main(String args[])
    {

        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            temp=a[n-1];
            for(int j=n-2;j>=0;j--)
            {
                a[j+1]=a[j];
            }
            a[0]=temp;




            System.out.println("After Rotation:");
            for(int k=0;k<5;k++)
            {
                System.out.print("[  "+a[k]+"   ]");

            }
            System.out.println();
        }



    }

}




