public class Interfaces implements Methods
{
	public void method1()
	{
		System.out.println("implementing method1 from interface Methods");
	}
	
	public void method2()
	{
		System.out.println("implementing method2 from interface Methods");
	}
	
	public static void main(String ... args)
	{
		Interfaces inf = new Interfaces();
		inf.method1();
		inf.method2();
		
	}
}


interface Methods 
{
	public void method1();
	public void method2();
}

