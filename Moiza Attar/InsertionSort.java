package com.company;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array : ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i;

            while(j>0 && arr[j-1] > temp){
                arr[j] =arr[j-1];
                j = j-1;

            }
            arr[j] = temp;
        }

        System.out.println("Insertion Sort: ");
        for (int i= 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
