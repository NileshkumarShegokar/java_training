import java.util.Scanner;

/// Shake class Implementation
class Shake implements Order
{
	static int shakePrice=20;
	static int shakeCnt;
	Scanner sc = new Scanner(System.in);
	public void orderItem()
	{
		System.out.println("How many Shake you want");
		shakeCnt=sc.nextInt();
	}	

	public void changePrice()
	{
		System.out.println("Please, Enter new price for Shake");
		shakePrice=sc.nextInt();
		System.out.println("Shake price has been updated");
	}
	
}
