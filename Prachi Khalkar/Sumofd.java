package com.company;

import java.util.Scanner;

public class Sumofd {

    public static void main(String[] args) {
	// write your code here
        int sum=0,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();

        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of digit is:"+sum);





    }
}
