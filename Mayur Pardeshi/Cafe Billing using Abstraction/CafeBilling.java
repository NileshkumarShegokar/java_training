import java.util.*;

public class CafeBilling 
{	

	public void viewReport()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("**********TODAY'S REPORT**********");
		System.out.println(" ");
		int totalCofffee=Coffee.coffeeCnt*Coffee.coffeePrice;
		int totalMuffines=Muffines.muffineCnt*Muffines.muffinePrice;
		int totalShake=Shake.shakeCnt*Shake.shakePrice;
		int total=totalCofffee+totalMuffines+totalShake;
		System.out.println("Coffee\t"+Coffee.coffeeCnt+"\t"+totalCofffee);
		System.out.println("Muffine\t"+Muffines.muffineCnt+"\t"+totalMuffines);
		System.out.println("Shake\t"+Shake.shakeCnt+"\t"+totalShake);
		System.out.println("----------------------------------------");
		System.out.println("Total\t\t"+total	);
		System.out.println("Proceed Amount:\t");
		int amt=sc.nextInt();
		System.out.println("Please Return:\t"+ (amt-total));
		System.out.println("----------------------------------------");
		System.out.println("Muffines available:\t"+Muffines.avaMuffines);
	}
	public static void main(String[] args)
	{
		int opt,or;
		
		CafeBilling cf = new CafeBilling();
		Order orderCoffee = new Coffee();
		Order orderMuffines = new Muffines();
		Muffines mf = new Muffines();
		//Shake sh = new Shake();
		//Coffee co = new Coffee();
		Order orderShake = new Shake();
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("**************************");
			System.out.println("Welcome To Mayur's Cafe");
			System.out.println("**************************");
			System.out.println(" 1. Place Order \n 2. Change Price \n 3. View Report \n 4. Bake Muffines \n 5. Exit");
			System.out.println("Please Select Option");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1: 
						do
						{						
							System.out.println("Choose your Order");
							System.out.println(" 1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit");
							or = sc.nextInt();
							switch(or)
							{
								case 1: // coffee order 
										orderCoffee.orderItem();
										break;
								case 2: //muffines order 
										orderMuffines.orderItem();
										
										break;
								case 3: //shake order 
										orderShake.orderItem();
										break;
								case 4: 
										break;
							}
						}while(or<4);
						break;
				case 2:	// change items price 
						int priceAmt=0;
						do
						{
						System.out.println("Which Item price you want to change ?");
						System.out.println("1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit \n ");
						priceAmt=sc.nextInt();
						
							switch(priceAmt)
							{
								case 1: orderCoffee.changePrice();
										break;
								case 2: orderMuffines.changePrice();
										break;
								case 3: orderShake.changePrice();
										break;
								case 4: 
										break;
								default:System.out.println("Invalid");
							}
						}while(priceAmt<4);
						break;		
				case 3: // display report 
						cf.viewReport();
						break;
								
				case 4: // bake muffines 
						//orderMuffines=mf;	
						mf.Bake();
						break;		
				default:System.out.println("Please, select valid option");		
			}
		}while(opt<5);	
	}
	
	
}

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

/// Interface 
interface Order
{
	public void orderItem();
	public void changePrice();
}