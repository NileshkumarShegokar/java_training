import java.util.*;


class Inclass {
    Scanner sc = new Scanner(System.in);

    int temp,key,j;

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

    void Insorting()
    {
        for(int i=1;i<n;i++)
        {
            key = arr[i];
            j = i - 1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    }

}





public class Insertion extends Inclass {
    public static void main(String args[])
    {
        System.out.println("Bubble sort");
        System.out.println("enter the size of array:");

        Inclass i1=new Inclass();

        i1.accept();
        System.out.println("Array before sorting:");
        i1.display();
        System.out.println("Array After Sorting:");
        i1.Insorting();
        i1.display();

    }
}
