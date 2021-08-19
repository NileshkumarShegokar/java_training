package com.company;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num, n1=0, rem, result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();

        num = n1;

        while (num != 0) {
            rem= num % 10;
            result += rem * rem * rem;
            num = num / 10;
        }

        if (result == n)
            System.out.println("Armstrong number");
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}