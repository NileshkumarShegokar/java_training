//TreeSet Program

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {

        Set tset= new TreeSet();

        tset.add("Moiza");
        tset.add("Yash");
        tset.add("Mayur");
        tset.add("Soma");
        tset.add("Moiza");
        System.out.println("Size : " + tset.size());
        System.out.println(tset);

        System.out.println("\n");
        System.out.println("Iterating element from TreeSet   : ");
        Iterator it = tset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
