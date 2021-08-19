import java.util.*;


class Xyz1
{
    Scanner sc=new Scanner(System.in);

    int cnt=0,flag=0;
    int mid,low,high;

    int n=sc.nextInt();
    int arr[]=new int[n];

    void  accept()
    {
        System.out.println("Enter the arr elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("Array elements Are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    void binarysearch() {




         low = 0;
         high =n-1;

        System.out.println("Enter key to search:");
        int key = sc.nextInt();



             while (low <=high)
             {
                 mid = ((low + high) / 2);
                 if (key == arr[mid])
                 {
                     flag = 1;
                     break;
                 }
                 else if (key < arr[mid])
                 {
                     high = mid - 1;
                 }
                 else
                 {
                     low = mid + 1;
                 }

             }


        if (flag == 1)
        {
            System.out.println(key + "   element found ");
        }
        else
        {
            System.out.println(key + "   element Not found ");
        }

    }
}






public class Binary extends Xyz1
{
   public static void main(String args[])
   {
       System.out.println("Binary Search");
        System.out.println("enter the size of array:");
        Xyz1 b=new Xyz1();

        b.accept();
        b.display();
        b.binarysearch();

    }
}
