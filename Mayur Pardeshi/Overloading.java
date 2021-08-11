import java.util.Scanner;
 
 
 public class Overloading
 {
	 public static void main(String args[])
	 {
		 Overloading ovl = new Overloading();
		 ovl.add(10,20);
		 ovl.add(10,20,30);
		 ovl.add(10.20f,20.50f);
		 ovl.add(10.20f,50);
		 
	 }
	 
	 public void add(int a, int b)
	 {
		 System.out.println("Addition of two Integer numbers :" +(a+b));
	 }
	 
	 public void add(int a, int b,int c )
	 {
		 System.out.println("Addition of three Integer Numbers :" +(a+b+c));
	 }
	 
	 public void add(float a, float b )
	 {
		 System.out.println("Addition of two Float Numbers :" +(a+b));
	 }
	 
	 public void add(int a, float b )
	 {
		 System.out.println("Addition of One Float and one Integer :" +(a+b));
	 }
 }