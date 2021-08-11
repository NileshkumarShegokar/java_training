//overloading

public class Sum {


    public int sum(int x, int y)
    {
        return (x + y);
    }


    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }


    public double sum(double x, double y)
    {
        return (x + y);
    }


	    public float sum(float x, float y)
	    {
	        return (x + y);
	    }



    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(50, 100));
        System.out.println(s.sum(50, 100, 150));
        System.out.println(s.sum(50.5, 100.5));
        System.out.println(s.sum(510.3, 100.5));
    }
}

