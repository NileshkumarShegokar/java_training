
/*
Use of resume() ,sleep(),suspend methods
 */

class Thread4 extends Thread {
    public void run( ) {
        try{
            System.out.println (" First thread starts running" );
            sleep(10000);
            System.out.println (" First thread finishes running" );
        }
        catch(Exception e){	}
    }
}

class Thread5 extends Thread {
    public void run( ) {
        try{
            System.out.println ( "Second thread starts running");
            System.out.println ( "Second thread is suspended");
            suspend( );
            System.out.println (" Second  thread runs again" );
        }
        catch(Exception e){	}
    }
}



public class Threaddemo3
{
    public static void main(String[] args) throws InterruptedException {
        Thread4 t5 = new Thread4();
        Thread5 t6= new Thread5( );

        t5.start( );
        t6.start( );

        System.out.println("Revive the second thread" );
        t6.resume( );
        System.out.println ("Second thread went for 10 seconds sleep " );
        t6.sleep (10000);




    }
}
