import java.util.*;
public class Strong
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0,rem=0;
        int num;
        System.out.print("ENTER THE NUMBER \n");
        n=sc.nextInt();
        num=n;
        while(num>0)
        {
            rem=num%10;
            sum=sum+factorial(rem);
            num=num/10;
        }
        if(n==sum)
        {
            System.out.print("IT IS A STRONG NUMBER \n");
        }
        else
        {
            System.out.print("IT IS NOT A STRONG NUMBER \n");
        }
    }
    static int factorial(int rem)
    {
        int fact=1;
        int i;
        for(i=1;i<=rem;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}