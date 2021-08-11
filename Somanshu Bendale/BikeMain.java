import java.util.*;
public class BikeMain
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Kawasaki k= new Kawasaki();
		Ducati d= new Ducati();
		int ch;
		do
		{
			System.out.println("1.Kawasaki");
			System.out.println("2.Ducati");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					k.showInfo();
					System.out.println("\n-----------------------------------\n");
					k.electronicsInfo();
					System.out.println("\n-----------------------------------\n");
					k.basicInfo();
					System.out.println("\n-----------------------------------\n");
				break;
				case 2:
					d.showInfo();
					System.out.println("\n-----------------------------------\n");
					d.electronicsInfo();
					System.out.println("\n-----------------------------------\n");
					d.basicInfo();
					System.out.println("\n-----------------------------------\n");
				break;
				default:
					System.out.println("Exit");
			}
		}while(ch<3);


	}
}