import java.util.Scanner;

public class Perfect
{
    public static void main(String[] args)
    {
        int n,sum=0,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=s.nextInt();
        i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }

        if(sum==n)
        {
            System.out.println("Number "+n+" is Perfect");
        }
        else
        {
            System.out.println("Number " +n +" is not Perfect");
        }
    }
}
