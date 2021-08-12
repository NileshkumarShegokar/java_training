import java.util.Scanner;

/// Coffee class Implementation
class Coffee implements Order
{
	static int coffeePrice = 15;
	static int coffeeCnt=0;
	Scanner sc = new Scanner(System.in);
	
	public void orderItem()
	{
		System.out.println("How many coffee you want");
		coffeeCnt=sc.nextInt();
		System.out.println(coffeeCnt);
	}
	
	public void changePrice()
	{
		System.out.println("Please, Enter new price for Coffee");
		coffeePrice=sc.nextInt();
		System.out.println("Coffe price has been updated");
	}	
}
