class cir implements area
   {
      public double calc(double x,double y)
        {
            return(pi*x*x);

         }
         public static void main(String arg[])
		 		 		        {

		 		 		           cir c = new cir();


		 		 		          System.out.println("\nArea of Circle is : " +c.calc(15,15));
        }

   }
