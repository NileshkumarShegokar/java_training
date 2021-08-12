import java.util.Scanner;

public class Coffee extends OrderBy
{
	
	static int coffee_price=10,coffee_count=0;
	Scanner sc=new Scanner(System.in);

	public void orderItem(int coffee_buy)
	{


		coffee_count+=coffee_buy;
	}

	public void currentBill(int coffee_buy)
	{
		System.out.println("Coffee\t"+coffee_buy+"\t"+(coffee_buy*coffee_price));
	}

	public void changePrice(int new_price)
	{

			coffee_price=new_price;
			System.out.println("New price of shake is "+coffee_price+" updated");
	}


}
