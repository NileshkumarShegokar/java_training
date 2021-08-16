
import java.util.*;


class Bsort {
    Scanner sc = new Scanner(System.in);

     int temp;

    int n = sc.nextInt();
    int arr[] = new int[n];

    void accept()
    {
        System.out.println("Enter the arr elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    void display()
    {

       for (int i = 0;i<n ;i++)
        {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

    void Bsorting()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

}






public class Bubble extends Bsort{
    public static void main(String args[])
    {
        System.out.println("Bubble sort");
        System.out.println("enter the size of array:");

         Bsort b1=new Bsort();

        b1.accept();
        System.out.println("Array before sorting:");
        b1.display();
        System.out.println("Array After Sorting:");
        b1.Bsorting();
        b1.display();

    }
}
