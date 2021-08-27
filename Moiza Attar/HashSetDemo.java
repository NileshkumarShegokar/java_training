//HashSet Program

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetDemo{
    public static void main(String args[]) {

        Set hset= new HashSet();

            hset.add("Moiza");
            hset.add("Yash");
            hset.add("Mayur");
            hset.add("Soma");
            hset.add("Moiza");
            System.out.println("Size : " + hset.size());
            System.out.println(hset);

            System.out.println("\n");
            System.out.println("Iterating element from HashSet : ");
            Iterator it = hset.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
}
