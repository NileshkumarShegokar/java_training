public class Prime
{
	public static void main(String... args)
	{	
		int flag=0;
		int n=102;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.print(n + " is prime number");
		}else{ 
			System.out.print(n +" is not a prime number");
		}
	}
	
}