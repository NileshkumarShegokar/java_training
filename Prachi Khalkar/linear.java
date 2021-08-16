import java.util.*;


 class Abc
{
    Scanner sc=new Scanner(System.in);

    int cnt=0,flag=0;

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
    void linearsearch()
    {
        System.out.println("Enter key to search:");
        int key=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(arr[j]==key)
            {
                //System.out.println(key+"   element found at location  "+j);
                flag=1;
                break;
            }
            else
            {
                cnt++;
            }
        }

        if(flag==1)
        {
            System.out.println(key+"   element found ");
        }
        else
        {
            System.out.println(key+"   element Not found ");
        }


    }
}




public class linear extends Abc{
        public static void main(String args[])
        {
            System.out.println("Linear Search");
            System.out.println("enter the size of array:");
            Abc l=new Abc();

            l.accept();
            l.display();
            l.linearsearch();

        }
}
