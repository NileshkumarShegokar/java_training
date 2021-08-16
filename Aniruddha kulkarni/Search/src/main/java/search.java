import java.util.Scanner;

public class search {

    static Scanner in = new Scanner(System.in);

    public void linear()
    {
        int i, n, search, array[];

        System.out.println("********* This is Linear search ********");
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those elements");

        for (i = 0; i < n; i++)
            array[i] = in.nextInt();

        System.out.println("Enter a value to find");
        search = in.nextInt();

        for (i = 0; i < n; i++)
        {
            if (array[i] == search)
            {
                System.out.println(search + " is present at location " + (i + 1) );
                break;
            }
        }
        if (i == n)
            System.out.println(search + " isn't present in array.");
    }

    public void binary()
    {
        int n, i, search, first, last, middle;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.println("********* This is Binary search ********");
        System.out.print("Enter Number of Elements :  ");
        System.out.println("//");
        n = scan.nextInt();

        System.out.print("Enter those Elements :  ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter a Number to Search: ");
        search = scan.nextInt();

        first = 0;
        last = n-1;
        middle = (first+last)/2;

        while(first <= last)
        {
            if(arr[middle] < search)
            {
                first = middle+1;
            }
            else if(arr[middle] == search)
            {
                System.out.print(search+ " Found at Location " +middle);
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first+last)/2;
        }

        if(first > last)
        {
            System.out.print(+search+ " is not Present in the List.");
        }
    }

    public static void main(String[] args) {

        search s=new search();

        System.out.println("press 1 for linear search\nPress 2 for binary search");
        int ch=in.nextInt();

        switch (ch)
        {
            case 1: {
                s.linear();
                break;
            }
            case 2:
                s.binary();
                break;
        }




    }
}


