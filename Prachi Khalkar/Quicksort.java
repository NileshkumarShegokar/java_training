import java.util.Scanner;

import java.util.*;

public class Quicksort {



      int partition(int arr[],int low,int high) {

          int pivote=arr[(low+high)/2];
          while(low<=high) {

              while( arr[low]<pivote)
              {
                    low++;
              }

              while(arr[high]>pivote)
              {
                    high--;
              }
              if(low<=high)
              {
                    int temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;

                    low++;
                    high--;
              }


          }

         return low;

      }

      void qsorting(int arr[],int low,int high)
      {
              int pi=partition(arr,low,high);
              if(low<pi-1)
              {
                   qsorting(arr,low,pi-1);
              }
              if(pi<high)
              {
                   qsorting(arr,pi,high);
              }

      }





    void display(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Quick sort");
         System.out.println("enter the size of array:");
         int n = sc.nextInt();
         int arr[] = new int[n];

         System.out.println("enter the array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

         Quicksort q = new Quicksort();
         System.out.println("array before sorting:");
         q.display(arr);
         q.qsorting(arr, 0, arr.length - 1);
         System.out.println("array After sorting:");
         q.display(arr);

     }





     }



