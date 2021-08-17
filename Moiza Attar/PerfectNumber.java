package com.company;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0, S=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++) {
            if (n % i== 0) {
                sum = sum + i;
            }
        }
            if(sum == n){
                System.out.println("Number is Perfect" );
            }
            else{
                System.out.println("Number is not Perfect");
            }
    }
}
