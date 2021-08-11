
public class Shake extends OrderBy 
{
	static int shake_price=30,shake_count=0;


	public void orderItem(int shake_buy)
	{


		shake_count+=shake_buy;
	}

	public void currentBill(int shake_buy)
	{
			System.out.println("Shake\t"+shake_buy+"\t"+(shake_buy*shake_price));
	}

	public void changePrice(int new_price)
	{
			shake_price=new_price;
			System.out.println("New price of shake is "+shake_price+" updated");
	}


}
