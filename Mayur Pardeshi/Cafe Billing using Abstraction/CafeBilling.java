import java.util.*;

public class CafeBilling 
{	

	Scanner sc = new Scanner(System.in);
	public void viewReport()
	{
	//	Scanner sc = new Scanner(System.in);
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
	
	public int Menu()
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("Welcome To Mayur's Cafe");
		System.out.println("**************************");
		System.out.println(" 1. Place Order \n 2. Change Price \n 3. View Report \n 4. Bake Muffines \n 5. Exit");
		System.out.println("Please Select Option");
		int opt = sc.nextInt();
		return opt;
	}
	
	public int ChooseOrder()
	{
		System.out.println("Choose your Order");
		System.out.println(" 1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit");
		int or = sc.nextInt();
		return or;
	}
	
	
	public int changePr()
	{
		System.out.println("Which Item price you want to change ?");
		System.out.println("1. Coffee \n 2. Muffines \n 3. Shake \n 4. Exit \n ");
		int changeAmt=sc.nextInt();
		return changeAmt;
	}
	
	public static void main(String[] args)
	{
	
		CafeBilling cf = new CafeBilling();
		Order orderCoffee = new Coffee();
		Order orderMuffines = new Muffines();
		Muffines mf = new Muffines();
		Order orderShake = new Shake();
		
	//	Scanner sc = new Scanner(System.in);
		int opt1;
		do
		{
			opt1=cf.Menu();
			switch(opt1)
			{
				case 1: 
						int or1;
						do
						{						
							or1=cf.ChooseOrder();
							switch(or1)
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
						}while(or1<4);
						break;
				case 2:	// change items price 
						int changeAmt1=0;
						do
						{
							changeAmt1=cf.changePr();
							switch(changeAmt1)
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
						}while(changeAmt1<4);
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
		}while(opt1<5);	
	}
	
	
}

