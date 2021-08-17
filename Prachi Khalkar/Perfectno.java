import java.util.Scanner;

public class Perfectno {




        public static void main(String[] args) {
            // write your code here
            int sum=0;
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the no:");
            int n=sc.nextInt();

            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;

                }
            }

            if(sum==n)
            {
                System.out.println(n+ "is perfect no ");
            }
            else
            {
                System.out.println(n+ "is not perfect no ");
            }



        }
    }


