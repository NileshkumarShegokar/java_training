This is readme

This is sample modified by somanshu.



//import java.lang.*;


public  class Demo
{
    

    public Demo(){
        x=5;
        y=2;
    }

    public void add(){
        int x=5,y=2;
        int z=x+y;
        System.out.println("Addition="+z);
    }

    public void sub(int x, int y)
    {
        System.out.println("Sub :"+(x-y));
    }

    public int mul(){
        int x=5,y=2;
        return (5*2);
    }

    public float div( float x, float y)
    {
        return (x/y);
    }

    public static void main(String args[])
    {
             Demo d =new Demo();
             
             d.add();
             d.sub(9,5);
             
             System.out.println("Mul :"+d.mul());
             System.out.println("Div:"+d.div(5, 2));

    }

}

/**
 * 
 * <scope> <return type> [keyword] <function name> ( [<arg1> , <arg2>, <arg3>.... ])
 * {
 * 
 * //function body
 * 
 * }
 * 
 * 
 * Ex:
 * public void show(){
 * 
 * }
 * 
 * Return type         Arguments
 * 
 * 0                    0
 * 0                    1
 * 1                    0   
 * 1                    1
 */







/**
 * 
 * OUTPUT:
 * 
 * Demo Object Created
 * Hi
 * 
 */

/**
 * 
 * Constructor
 * 
 * 1. constructor name should be same as class name (i.e. start with capital)
 * 2. it's most probably public
 * 3. no return value - not even void
 * 
 */


