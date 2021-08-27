import java.lang.Runnable;

class Runnable1 implements Runnable {
    public void run( ) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 = "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runnable2 implements Runnable {
    public void run( ) {
        for(int j = 1; j <= 5; j++) {
            System.out.println("Thread 2 = "+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runnable3 implements Runnable {
    public void run( ) {
        for(int k = 1; k <= 5; k++) {
            System.out.println("Thread 3 = "+ k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}





public class RunnableThread {
    public static void main(String[] args) {
        Runnable1  r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        Runnable2 r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        Runnable3 r3 = new Runnable3();
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();



    }
}
