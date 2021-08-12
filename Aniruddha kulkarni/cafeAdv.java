import java.util.Scanner;


interface cafeV2
{
	public void placeOrder();
	public void changePrice();
	public void report();
	public void bakeMuffin();
}


class Cafe2 implements cafeV2
{
	int a=0, cPrice=10, mPrice=20, sPrice=30, total_price=0,
	int cCount=0, mCount=0, sCount=0,
	int bake=25;
	Scanner sc = new Scanner(System.in);

	public void placeOrder()
	{
		int byCoffee=0, byMuffin=0, byShake=0,ch;
		do
		{

			System.out.println(" 1.Press 1 to Coffee\n 2.Press 2 to Muffin\n 3.press 3 to Shake\n 4.Exit");
			System.out.println("\nEnter your Choice : ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1 :
						System.out.println("How many coffee you want to buy: ");
						byCoffee=sc.nextInt();
						cCount=cCount+byCoffee;
				break;


				case 2 :
						System.out.println("How many Muffins you want to buy: ");
						byMuffin=sc.nextInt();
						mCount=mCount+byMuffin;
						bake=bake-mCount;
						System.out.println("No. of muffins left: " +bake);

				break;


				case 3 :
						System.out.println("How many shakes you want to buy: ");
						byShake=sc.nextInt();
						sCount=sCount+byShake;
				break;


				case 4:

						System.out.println("Thank you!!!");
						System.out.println("Your order is:");
								 System.out.println("Coffee\t"+byCoffee+"\t"+(byCoffee*cPrice));
								 System.out.println("Muffin\t"+byMuffin+"\t"+(byMuffin*mPrice));
								 System.out.println("Shake\t"+byShake+"\t"+(byShake*sPrice));
								 System.out.println("**********************");
								 total_price=(byCoffee*cPrice)+(byMuffin*mPrice)+(byShake*sPrice);

								 System.out.println("Total: "+total_price);
								 System.out.println("Amount paid: ");
								 int pay=sc.nextInt();

								 if(total_price<pay)
								 		System.out.println("Return "+(pay-total_price)+" rupees");
								 else
		  								System.out.println("Thank you");




				break;


				default :
							System.out.println("Enter between 1-4 only");


			}

		}while(ch != 4);
 }


	public void changePrice()
	{

		int chh;
		do{


			System.out.println(" 1.Press 1 to change price of Coffee\n 2.Press 2 to change price of Muffin\n 3.Press 3 to change price of Shake\n 4.Exit");

			System.out.println("\nEnter your Choice : ");
			 chh = sc.nextInt();

			switch(chh)
			{
				case 1 :
						System.out.println("Enter new price for coffee: ");
						cPrice=sc.nextInt();
						System.out.println("New price updated");


				break;


				case 2 :
						System.out.println("Enter new price for muffin: ");
						mPrice=sc.nextInt();
		 				System.out.println("New price updated");
				break;


				case 3 :
						System.out.println("Enter new price for shake: ");
						sPrice=sc.nextInt();
		   				System.out.println("New price updated");
				break;

				case 4:
						break;


				default :
							System.out.println("Enter valid input");


			}

	}while(chh < 4);

	}

   public void report()
   {
				System.out.println("-----$--$--$--$--$--$--$------");
				System.out.println("Welcome to Aniruddha's cafe ");
				System.out.println("-----$--$--$--$--$--$--$------");
				System.out.println("Coffee \t"+cCount+"\t"+(cCount*cPrice));
				System.out.println("Muffin \t"+mCount+"\t"+(mCount*mPrice));
				System.out.println("Shake \t"+sCount+"\t"+(sCount*sPrice));
				System.out.println("**********************");
				int report_price=(cCount*cPrice)+(mCount*mPrice)+(sCount*sPrice);
		  		System.out.println("Total: "+report_price);



   }

   public void bakeMuffin()
   {
	   bake=bake+25;


   }

}






 class cafeAdv
{
	public static void main(String args[])
	{
		int bake=25;

		Scanner sc = new Scanner(System.in);

		Cafe2 cv2 = new Cafe2();


		int ch1;

				System.out.println("-----$--$--$--$--$--$--$------");
				System.out.println("Welcome TO Aniruddha's cafe");
				System.out.println("-----$--$--$--$--$--$--$------");

				do
				{

					System.out.println(" 1.Press 1 to place order\n 2.Press 2 to change price\n 3.press 3 to see report\n 4.Press 4 to bake muffins\n 5.Exit");

					System.out.println("\nEnter your Choice : ");
					 ch1 = sc.nextInt();

					switch(ch1)
					{
						case 1 :
									cv2.placeOrder();
						break;

						case 2 :
									cv2.changePrice();
						break;

						case 3 :
									cv2.report();
						break;

						case 4 :
									cv2.bakeMuffin();
									System.out.println("No. of freshly baked muffins: " +bake);
					     break;
					}



				}while(ch1<5);


	}
}