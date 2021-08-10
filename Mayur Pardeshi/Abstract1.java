


class Abstract1 extends Parent
{
	public void child()
	{
		System.out.println("child : I'm Astronaut");
	}
	
	
	public static void main(String ... args)
	{
			Abstract1 abs = new Abstract1();
			abs.father();
			abs.child();
		
	}
}

abstract class Parent 
{
	public void father()
	{
		System.out.println("father : I'm Teacher ");
	}
	public abstract void child();
	
}