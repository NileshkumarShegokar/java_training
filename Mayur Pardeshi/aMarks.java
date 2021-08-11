class aMarks extends Marks
{
	float w1,x1,y1,z1;
	public aMarks(float w,float x,float y,float z)
	{
		w1=w;
		x1=x;
		y1=y;
		z1=z;
	}
	public void getPercentage()
	{
		float tot=w1+x1+y1+z1;
		float per=(float)((tot/400)*100);
		System.out.println("Perentage of aMarks :"+per);
	}
	
}