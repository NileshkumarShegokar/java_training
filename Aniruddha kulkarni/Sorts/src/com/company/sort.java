package com.company;

import java.util.Scanner;

public class sort {

    static Scanner in = new Scanner(System.in);

    public void bubble()
    {
        int arr[] ={5,6,3,8,2,1,4,7};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();

        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(arr[j-1] > arr[j])
                {

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void selection()
    {
        int[] arr1 = {5,6,3,8,2,1,4,7};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr1.length; j++){
                if (arr1[j] < arr1[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr1[index];
            arr1[index] = arr1[i];
            arr1[i] = smallerNumber;
        }
        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public  void insertion()
    {
       int[] array1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion Sort");
        for(int i:array1){
            System.out.print(i+" ");
        }
        System.out.println();

        int n = array1.length;
        for (int j = 1; j < n; j++) {
            int key = array1[j];
            int i = j-1;
            while ( (i > -1) && ( array1 [i] > key ) ) {
                array1 [i+1] = array1 [i];
                i--;
            }
            array1[i+1] = key;

        }



    }



    public static void main(String[] args) {

        sort s=new sort();

        System.out.println("press 1 for Bubble sort\nPress 2 for selection sort\nPress 3 for insertion sort");
        int ch=in.nextInt();

        switch (ch)
        {
            case 1: {
                s.bubble();
                break;
            }
            case 2:
                s.selection();
                break;

            case 3:
                s.insertion();

                    break;

        }




    }
}


