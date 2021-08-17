package com.company;
import java.util.*;


public class Reverse {

    public static void main(String[] args) {
	// write your code here
        int rem=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();

        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("reverse no is:"+rev);


    }
}
