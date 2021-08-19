import java.util.Scanner;

class Ssort {
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

    void Ssorting()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }

}






public class Selection extends Ssort{
    public static void main(String args[])
    {
        System.out.println("Selection sort");
        System.out.println("enter the size of array:");

        Ssort s1=new Ssort();

        s1.accept();
        System.out.println("Array before sorting:");
        s1.display();
        System.out.println("Array After Sorting:");
        s1.Ssorting();
        s1.display();

    }
}
