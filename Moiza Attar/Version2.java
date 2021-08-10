
import java.util.Scanner;


interface MoizaCafe
{
	public void order();
	public void changePrice();
	public void report();
}


class Cafe implements MoizaCafe
{
	int a=0, coffee=10, muffin=20, shake=30, Total=0, coffee_count=0, muffin_count=0, shake_count=0;

	Scanner sc = new Scanner(System.in);

	public void order()
	{
		int c1=0, m1=0, s1=0;
		do
		{
			System.out.println("\n*******Choose your order*******");
			System.out.println(" 1.Press 1 to Coffee\n 2.Press 2 to Muffin\n 3.press 3 to Shake\n 4.Exit");

			System.out.println("\nEnter your Choice : ");
			a = sc.nextInt();

			switch(a)
			{
				case 1 :
							System.out.println("How many Coffee you want to buy : ");
							c1 = sc.nextInt();
							coffee_count+=c1;

				break;


				case 2 :
							System.out.println("How many Muffin you want to buy : ");
							m1 = sc.nextInt();
							muffin_count+=m1;
				break;


				case 3 :
						 	System.out.println("How many Shake you want to buy : ");
							s1 = sc.nextInt();
							shake_count+=s1;
				break;


				case 4:

							System.out.println("<<<<<<<<<< Your order is >>>>>>>>>>>>");

							System.out.println("Coffee  "  +c1+ "    "   +(c1*coffee));

							System.out.println("Muffin  "  +m1+ "    "   +(m1*muffin));

							System.out.println("Shake   "  +s1+ "    "   +(s1*shake));

							System.out.println("______________________________");

							Total = (c1*coffee) + (m1*muffin) + (s1*shake);
							System.out.println("Total        " +Total);

							System.out.print("Proceed Amount : ");
							int amt = sc.nextInt();

							int ramt = amt - Total;
							System.out.println("Please return amount : " +ramt);

				break;


				default :
							System.out.println("Invalid choice");

							System.out.println("\n");

			}

		}while(a != 4);
 }


	public void changePrice()
	{
		do{

			System.out.println("\n*******Which item price you want to change*******");
			System.out.println(" 1.Coffee\n 2.Muffin\n 3.Shake\n 4.Exit");

			System.out.println("\nEnter your Choice : ");
			a = sc.nextInt();

			switch(a)
			{
				case 1 :
							System.out.println("Please enter new price for coffee : ");
							coffee = sc.nextInt();

				break;


				case 2 :
							System.out.println("Please enter new price for Muffin : ");
						    muffin= sc.nextInt();
				break;


				case 3 :
							 System.out.println("Please enter new price for Shake : ");
							 shake = sc.nextInt();
				break;


				default :
							System.out.println("Invalid choice");

							System.out.println("\n");
			}

	}while(a < 4);

	}

   public void report()
   {
		System.out.println("*********************************************************");
		System.out.println("\t\tWELCOME TO MOIZA'S CAFE");
		System.out.println("**********************************************************");

		System.out.println("Coffee  "  +coffee_count+ "    "   +(coffee*coffee_count));


		System.out.println("Muffin  "  +muffin_count+ "    "   +(muffin*muffin_count));


		System.out.println("Shake   "  +shake_count+ "    "   +(shake*shake_count));

		System.out.println("______________________________");

		Total = (coffee*coffee_count) + (muffin*muffin_count)+(shake*shake_count);
		System.out.println("Total        " +Total);

		System.out.println("Total muffin's Baked is : 50");

		int muff = 50 - muffin_count;
		System.out.println("Muffin left : " +muff);



   }

}






 class Version2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Cafe c = new Cafe();


		int ch;

				System.out.println("*********************************************************");
				System.out.println("\t\tWELCOME TO MOIZA'S CAFE");
				System.out.println("**********************************************************");

				System.out.println("\n");


				do
				{
					System.out.println("****************** Menu ********************");
					System.out.println(" 1.Press 1 to enter order\n 2.Press 2 to change price\n 3.press 3 to view report\n 4.Press 4 to bake muffins\n 5.Exit");

					System.out.println("\nEnter your Choice : ");
					ch = sc.nextInt();

					switch(ch)
					{
						case 1 :
									c.order();
						break;

						case 2 :
									c.changePrice();
						break;

						case 3 :
									c.report();
						break;

						case 4 :
									System.out.println("25 Muffin baked");
					     break;
					}



				}while(ch<5);


	}
}