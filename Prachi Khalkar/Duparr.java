import java.util.*;




public class Duparr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of arr:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the arr element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("duplicate elements:");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                     break;
                }
            }
        }
    }



    }


