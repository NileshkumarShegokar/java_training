public class Calculator
{
	public void add(int a,int b)
	{
		System.out.println("Addition of 2 no.s is :"+(a+b));
	}
	/*public int add(int a,int b)
	{
		return a+b;
			//System.out.println("Addition of 2 no.s is :"+(a+b));
	}*/
	public void add(int a,int b, int c)
	{
			System.out.println("Addition of 3 no.s is :"+(a+b+c));
	}
	public int mul(int a,int b)
	{
		return a*b;

	}
	public double add(double a,double b)
	{
		return a+b;

	}
	public float mul(float a,float b)
	{
			return a*b;

	}
	public static void main(String args[])
	{
		Calculator c= new Calculator();
		c.add(10,20);
		c.add(10,2,4);
		System.out.println("double addition of 2 no.s is : "+c.add(2.2,3.4));;

		System.out.println("Multiplication of 2 no.s is : "+c.mul(14,2));
		System.out.println("Multiplication of 2 float no.s is : "+c.mul(14.2f,2.4f));
	}
}