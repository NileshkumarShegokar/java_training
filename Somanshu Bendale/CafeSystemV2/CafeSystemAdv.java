import java.util.Scanner;

public class CafeSystemAdv
{
	Scanner sc=new Scanner(System.in);
	OrderBy c=new Coffee();
	OrderBy m=new Muffin();
	OrderBy s=new Shake();
	int total_price;
	
	public int current_Total(int coffee_buy,int muffin_buy,int shake_buy)
	{
		total_price=(coffee_buy*Coffee.coffee_price)+(muffin_buy*Muffin.muffin_price)+(shake_buy*Shake.shake_price);
		return total_price;

	}

	public void view_Report()
	{
		System.out.println("***************************************");
		System.out.println("\tWelcome to Micra Bistro's");
		System.out.println("***************************************");
		System.out.println("Coffee \t"+Coffee.coffee_count+"\t"+(Coffee.coffee_count*Coffee.coffee_price));
		System.out.println("Muffin \t"+Muffin.muffin_count+"\t"+(Muffin.muffin_count*Muffin.muffin_price));
		System.out.println("Shake \t"+Shake.shake_count+"\t"+(Shake.shake_count*Shake.shake_price));
		System.out.println("--------------------------------------------");

		int report_price=(Coffee.coffee_count*Coffee.coffee_price)+(Muffin.muffin_count*Muffin.muffin_price)+(Shake.shake_count*Shake.shake_price);
		System.out.println("Total:-\t"+(Coffee.coffee_count+Muffin.muffin_count+Shake.shake_count)+"\t"+report_price);

		System.out.println("\nNumber of Muffins in stock: "+Muffin.noOfMuffins);
	}

	public void pay_inorder(int total_price, int amt_pay)
	{
		if(total_price<amt_pay)
			System.out.println("please return "+(amt_pay-total_price)+" rupees");
		else
			System.out.println("Thank you !!!!!!!!!!!!!");
	}
	
	public int main_menu()
	{
		System.out.println("***************************************");
		System.out.println("\tWelcome to Micra Bistro's");
		System.out.println("***************************************");
		System.out.println("1. Place order\n2. Change price\n3. View report\n4. Bake muffins\n5. Exit");
		System.out.println("Enter yout choice: ");
		int ch = sc.nextInt();
		return ch;
	}
	public int product_menu()
	{
		System.out.println("Please choose your order:--");
		System.out.println("1. Coffee\n2. Muffin\n3. Shake\n4. Exit");
		System.out.println("Enter your choice: ");
		int ch =sc.nextInt();
		return ch;
	}
	
	public void price_change()
	{
		System.out.println("Enter the product you want to change the price of:--");
		System.out.println("1. Coffee\n2.Muffin\n3.Shake\n4.Exit");
		System.out.println("Enter your choice:");
		int price_menu=sc.nextInt();
		int new_price;
		switch(price_menu)
		{
			case 1:
				System.out.println("Enter new price for coffee: ");
				new_price=sc.nextInt();
				c.changePrice(new_price);

			break;
			case 2:
				System.out.println("Enter new price for muffin: ");
				new_price=sc.nextInt();
				m.changePrice(new_price);

			break;
			case 3:
				System.out.println("Enter new price for shake: ");
				new_price=sc.nextInt();
				s.changePrice(new_price);
			break;
			case 4:

			break;
			default:
				System.out.println("Enter valid input");

		}
	}
	
	public void order_product()
	{
	
		
					int coffee_buy=0,shake_buy=0,muffin_buy=0;
					int or;
					do
					{

						or=product_menu();
						switch(or)
						{
							case 1:
								System.out.println("How many coffee u want to buy: ");
								coffee_buy=sc.nextInt();
								c.orderItem(coffee_buy);

							break;
							case 2:
								System.out.println("How many Muffins u want to buy: ");
								muffin_buy=sc.nextInt();
								m.orderItem(muffin_buy);

							break;
							case 3:
								System.out.println("How many shakes u want to buy: ");
								shake_buy=sc.nextInt();
								s.orderItem(shake_buy);
							break;
							case 4:
								System.out.println("Thank you for the order!!!!!");
							break;
							default:
								System.out.println("Enter the valid input");

						}

					}while(or<4);
					
					System.out.println("Your order is:");
					if(coffee_buy>0)
						c.currentBill(coffee_buy);
					if(muffin_buy>0)
						m.currentBill(muffin_buy);
					if(shake_buy>0)
						s.currentBill(shake_buy);
					System.out.println("----------------------------------------------------");
					total_price=current_Total(coffee_buy,muffin_buy,shake_buy);

					System.out.println("Total:\t\t"+total_price);
					System.out.println("Proceed amount: ");
					int amt_pay=sc.nextInt();
					pay_inorder(total_price,amt_pay);
		}
	
			
	public static void main(String args[])
	{
			
			CafeSystemAdv cf=new CafeSystemAdv();
			
			Muffin bake=new Muffin();
			

			int ch;
			do
			{
				ch=cf.main_menu();
				
				switch(ch)
				{
					case 1:
						cf.order_product();



					break;
					case 2:
						cf.price_change();



					break;
					case 3:
							cf.view_Report();
					break;
					case 4:
							
						bake.bakeMuffins();
						System.out.println("\nNumber of Muffins in stock: "+Muffin.noOfMuffins);


					break;
					case 5:

					break;
					default:
						System.out.println("Enter the valid input");
				}



			}while(ch<5);
	}
	

}
