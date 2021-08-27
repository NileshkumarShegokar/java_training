
class Show{

    public synchronized void display(int n){
        System.out.println("Table of " + n);
        for(int i=1;i<=10;i++){
            System.out.println(n*i);

        }
    }
}

class Thread1 extends Thread{
    Show s;
    Thread1(Show s){
        this.s=s;
    }
    public void run(){
        s.display(2);
    }
}

class Thread2 extends Thread{
    Show s;
    Thread2(Show s){
        this.s=s;
    }
    public void run(){
        s.display(5);
    }
}

public class Syncronized{
    public static void main(String args[]){

        Show obj = new  Show();
        Thread1 t1=new  Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}
