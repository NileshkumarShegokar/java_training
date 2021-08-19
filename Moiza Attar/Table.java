class Table
{
	public static void main(String args[])
	{
		int n = 5, a,b, c=10, sum=0;
		for(int i=1; i<=10; i++)
		{
			a = n * i;
			System.out.println("table " +a);
			sum = sum + a;
			System.out.println("sum" +sum);
		}

		System.out.println("\n");

		for(int x=10; x>=1; x--)
		{
			b = c*x;
			System.out.println("table " +b);
		}

     }
}


