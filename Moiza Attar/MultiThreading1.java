class Thread1 extends Thread{
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

class Thread2 extends Thread {
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

class Thread3 extends Thread{
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

public class MultiThreading1 {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}