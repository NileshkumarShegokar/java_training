package com.company;
import java.util.Scanner;

public class StrongNumber {
        public static void main(String[] args) {
            int n, i, fact, rem, sum = 0;

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            n = sc.nextInt();

            int temp = n;

            while(n != 0)
            {
                i = 1;
                fact = 1;
                rem = n % 10;

                while(i <= rem)
                {
                    fact = fact * i;
                    i++;
                }
                sum = sum + fact;
                n = n / 10;
            }

            if(sum == temp)
                System.out.println(temp + " is a strong number");
            else
                System.out.println(temp + " is not a strong number");

            System.out.println();
        }
    }

