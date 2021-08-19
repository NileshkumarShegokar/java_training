package com.company;

import java.util.Scanner;

public class Storngno {

    public static void main(String[] args) {
	// write your code here

         Scanner sc=new Scanner(System.in);

         int rem=0,sum=0;
         System.out.println("Enter the Storng no:");
         int n=sc.nextInt();

         int temp=n;
         while(n!=0)
         {
             int i=1,fact=1;
             rem=n%10;
             while(i<=rem)
             {
                  fact=fact*i;
                  i++;
             }


             sum=sum+fact;
             n=n/10;


         }
         if(sum==temp)
         {
             System.out.println(temp+" is storng no");
         }
         else
         {
             System.out.println(temp+" is not storng no");
         }



    }
}
