import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberAssign {
    Scanner sc=new Scanner(System.in);

    public boolean perfectNo(int num) {


        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == num && num != 1)

            return true;

        return false;
    }

    public void strongNo(int range)
    {
        for(int i=1;i<=range;i++)
        {
            int num2=i;
            int num1=i;
            int sum=0;
            int fact=1;
            while(num1!=0)
            {   fact=1;
                int rem=num1%10;
                num1=num1/10;
                for(int j=1;j<=rem;j++)
                    fact=fact*j;
                sum=sum+fact;
            }
            if(sum==num2)
                System.out.println(i+" ");
        }
    }

    public void armstrongNo(int range)
    {
        int temp,num,rem,counter=0;
        for(int i=2; i<range; i++)
        {
            temp = i;
            num = 0;
            while(temp != 0)
            {
                rem = temp%10;
                num = num + rem*rem*rem;
                temp = temp/10;
            }
            if(i == num)
            {
                if(counter == 0)
                {
                    System.out.print("Armstrong Numbers Between "+range+": ");
                }
                System.out.print(i + "  ");
                counter++;
            }
        }

        if(counter == 0)
        {
            System.out.print("There is no Armstrong number Between  "+range);
        }
    }
    public int sumOfDigits()
    {
        int sum=0;
        System.out.println("Enter the number u want sum of digits:");
        int no= sc.nextInt();
        while(no>0)
        {
            sum=sum+no%10;
            no=no/10;

        }
        return sum;
    }

    public void reverseNo()
    {
        int no,rev=0;
        System.out.println("Enter the number u want reverse of: ");
        no=sc.nextInt();
        while(no!=0)
        {
            int rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("Reverse number is :"+rev);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NumberAssign n= new NumberAssign();
        /*System.out.println("Enter the range :");
        int range=sc.nextInt();*/
        /*
            //for Perfect number
            for(int i=2;i<=range;i++) {

           if(n.perfectNo(i))
            {
                System.out.println(i+" is perfect Number");
            }

        }*/

        //  from strong number
                //n.strongNo(range);

        //  From Armstrong number
            //n.armstrongno(range);

        // from sum of digits
            //System.out.println("Sum of digits :"+n.sumOfDigits()); ;

        // from reverse number
            n.reverseNo();



    }
}

