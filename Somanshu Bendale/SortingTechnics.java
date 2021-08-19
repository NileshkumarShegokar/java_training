import java.util.Scanner;

public class SortingTechnics {
    public void arrayDisplay(int a[])
    {
        for(int i:a)
            System.out.println(i+" ");
    }
    public void bubbleSort(int a[])
    {
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("By bubble sort sorted array is:");
        arrayDisplay(a);
    }


    public void insertionSort(int a[])
    {
        for (int k = 1; k < a.length; k++)
        {
            int temp = a[k];
            int j = k - 1;
            while (j >= 0 && temp <= a[j])
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
        System.out.println("By insertion sort , sorted elements ...");
        arrayDisplay(a);

    }

    public void selectionSort(int a[])
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[index])
                {
                    index = j;
                }
            }
            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;
        }
        System.out.println("by Selection sort, sorted array is:");
        arrayDisplay(a);
    }


    public void linearSearch(int a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key u want to search in array: ");
        int key = sc.nextInt();
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == key)
            {
                System.out.println(key + " found at " + i);
            } else
            {
                System.out.println(key + " Element not found");
            }
        }
    }

    public void binarySearch(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to find:");
        int x = sc.nextInt();
        int l = 0, r = a.length - 1;
        while (l <= r)
        {
            int m = l + (r - l) / 2;


            if (a[m] == x)
                System.out.println(x + " Found at " + m);


            if (a[m] < x)
                l = m + 1;


            else
                r = m - 1;

        }
    }

    public void arrayLeftRotation(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            int temp = a[a.length - 1];
            for (int j = a.length - 2; j >= 0; j--)
            {
                a[j + 1] = a[j];
            }
            a[0] = temp;

            System.out.println("Rotated array is: ");
            arrayDisplay(a);

        }
    }


    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element u want to search:");
        int n=sc.nextInt();
        int a[]=new int[n];
        SortingTechnics s=new SortingTechnics();
        System.out.println("Enter array: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        s.arrayLeftRotation(a);
    }
}
