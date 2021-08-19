
import java.util.*;



public class Perfectbet {

    public static void main(String args[])
    {

        int n=0,sum=0;
        Scanner sc=new Scanner(System.in);

        //System.out.println("enter the no:");
        //int n=sc.nextInt();

        System.out.println("enter the Starting no:");
        int s=sc.nextInt();

        System.out.println("enter the ending no:");
        int e=sc.nextInt();

        for(int j=s;j<=e;j++) {
            sum=1;
            for(int i=2;i<j;i++)
            {
                if(j%i==0)
                    sum=sum+i;

            }

            if(j==sum)

                System.out.print(j+" ");

        }









    }
}
