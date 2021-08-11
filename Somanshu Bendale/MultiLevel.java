class Brownie
{
	public void flavour()
	{
		System.out.println("Brownie is sweet");
	}
}

class Misal extends Brownie
{
	public void flavour()
	{
		System.out.println("Brownie does not goes well with misal because");
		System.out.println(" Misal is Spicy And");
		super.flavour();
	}
}

class Icecream extends Misal
{
	public void flavour()
	{
		System.out.println("IceCream goes well with brownie because ");
		super.super.flavour();
	}
}

class MultiLevel
{
	public static void main(String args[])
	{
		Icecream i=new Icecream();
		Misal m= new Misal();
		i.flavour();
	}
}