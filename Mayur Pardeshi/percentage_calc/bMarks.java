class bMarks extends Marks
{
	float a1,b1,c1;
	public bMarks(float a,float b,float c)
	{
		a1=a;
		b1=b;
		c1=c;
	}
	public void getPercentage()
	{
		float tot=a1+b1+c1;
		float per=(float)((tot/300)*100);
		System.out.println("Perentage of bMarks :" +per);
	}
	
}