import java.util.*;



public class Storngbet
{
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the Starting no:");
        int s = sc.nextInt();

        System.out.println("enter the ending no:");
        int e = sc.nextInt();


        int rem=0,sum=0;
      for(int k=s;k<=e;k++) {
            sum=0;

          int temp = k;
          while (temp != 0) {
              int i = 1, fact = 1;
              rem = temp % 10;
              while (i <= rem) {
                  fact = fact * i;
                  i++;
              }


              sum = sum + fact;
              temp= temp / 10;



          }

          if(sum==k)
          {
              System.out.println(k+" ");
          }


      }





    }

    }
