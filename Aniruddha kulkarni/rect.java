interface area
      {
          double pi = 3.14;
          double calc(double x,double y);
       }

class rect implements area
   {
      public double calc(double x,double y)
        {
            return(x*y);
         }
         public static void main(String arg[])
		 		        {
		 		           rect r = new rect();


		 		         System.out.println("\nArea of Rectangle is : " +r.calc(10,20));


        }
   }


