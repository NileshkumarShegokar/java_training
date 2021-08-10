


/*
class aMarks extends Marks
{
	int w1,x1,y1,z1;
	public aMarks(int w,int x,int y,int z)
	{
		w1=w;
		x1=x;
		y1=y;
		z1=z;
	}
	public void getPercentage()
	{
		
		System.out.println("Perentage of aMarks :"+(w1+x1+y1+z1/400*100);
	}
	
}

class bMarks extends Marks
{
	int a1,b1,c1;
	public bMarks(int a,int b,int c)
	{
		a1=a;
		b1=b;
		c1=c;
	}
	public void getPercentage()
	{
		System.out.println("Perentage of bMarks :" +(a1+b1+c1/300*100);
	}
	
}


abstract class Marks
{
	abstract void getPercentage();
}
*/
public class Practice2 
{
	
	
	public static void main(String args[])
	{
		
		aMarks m1 = new aMarks(70,80,90,95);
		bMarks m2 = new bMarks(70,80,90);
		m1.getPercentage();
		m2.getPercentage();
		
		
	}
}