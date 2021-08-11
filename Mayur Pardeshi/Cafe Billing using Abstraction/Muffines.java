import java.util.Scanner;

/// Muffines class Implementation
class Muffines implements Order
{
	static int muffinePrice=20;
	static int avaMuffines=0;
	static int muffineCnt=0;
	Scanner sc = new Scanner(System.in);
	
	public void orderItem()
	{
		System.out.println("How many Muffines you want ??");
		muffineCnt=sc.nextInt();
		if(avaMuffines<=0 || muffineCnt > avaMuffines)
		{
			Bake();
		}
		avaMuffines= avaMuffines - muffineCnt;
		System.out.println("Avialable Muffines :" +avaMuffines);
	}
	
	public void Bake()
	{
			System.out.println("Please, Bake Muffines first");
			Scanner sc = new Scanner(System.in);
			System.out.println("How many Muffines you want to Bake ?");
			avaMuffines = avaMuffines+sc.nextInt();
			System.out.println(avaMuffines+ " Muffines are available now");
	}

	public void changePrice()
	{
		System.out.println("Please, Enter new price for Muffines");
		muffinePrice=sc.nextInt();
		System.out.println("Muffines price has been updated");
	}
	
}
