public class PatternLoop
{
	public static void main(String args[])
	{
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.println("*");
			}
			System.out.println("");
	    }
	}
}