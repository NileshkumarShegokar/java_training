public class Triangle
{
	public static void main(String... args)
	{
		int len = args.length;
		if(len == 2 )
		{
			int b = Integer.parseInt(args[0]);
			int h = Integer.parseInt(args[1]);
			double area = 0.5*b*h;
			System.out.print("Area of triangle for height " + h + " & base " + b + " is : " + area );

		}
		else
		{
			System.out.print(" There must be two arguments only");

		}
		
	}
};

class Tri
{
	
		
	
}
/*
// By splitting the string 
public class Triangle
{
	public static void main(String... args)
	{
		int len = args.length;
		if(len == 1 )
		{
		String[] str = args[0].split("_");
		int base = Integer.parseInt(str[0]);
		int height = Integer.parseInt(str[1]);
		double area = 0.5*base*height;
		System.out.print("Area of triangle for h " + height + " & b " + base + " is : " + area );
		}
		else
		{
			System.out.print(" There must be two arguments only");

		}
		
	}
}
*/