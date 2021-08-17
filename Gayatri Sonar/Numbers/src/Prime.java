import java.util.Scanner;

public class Prime
{
        public static void main(String args[])
        {
            int n,flag=0,i;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Number:");
            n=s.nextInt();
            i=2;
            while(i<n)
            {
                if(n%i==0)
                {
                    flag=1;
                }
                i++;
            }

            if(flag==0)
            {
                System.out.println("Number "+n+" is Prime");
            }
            else
            {
                System.out.println("Number " +n +" is not prime");
            }
        }

}
