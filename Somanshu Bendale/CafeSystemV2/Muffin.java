import java.util.Scanner;

public class Muffin extends OrderBy
{
	static int muffin_price=25,muffin_count=0,noOfMuffins=25;
	Scanner sc=new Scanner(System.in);

	public void orderItem(int muffin_buy)
	{
		if(noOfMuffins==0)
				{
					System.out.println("There are no muffins left, kindly bake the muffins");
					System.out.println("If you want to bake muffins click(y/n): ");
					char muf=sc.next().charAt(0);
					if(muf=='y')
						bakeMuffins();


				}
				else
				{

						muffin_count+=muffin_buy;
						noOfMuffins-=muffin_buy;
						System.out.println("Muffins left: "+noOfMuffins);
				}
	}


	public void currentBill(int muffin_buy)
	{
			System.out.println("Muffin\t"+muffin_buy+"\t"+(muffin_buy*muffin_price));
	}

	public void changePrice(int new_price)

	{

			muffin_price=new_price;
			System.out.println("New price of shake is "+new_price+" updated");
	}

	public void bakeMuffins()
		{
			noOfMuffins+=25;
			System.out.println("25 Muffins freshly baked");
		}
}
