import java.util.*;

public class Setdemo {
    public static  void main(String[] args) {
        Set s=new HashSet();

        s.add("WEB");
        s.add("technology");
        s.add("Java");
        s.add("technology");
        System.out.println("size of list is:"+s.size());


        for(Object name:s)
        {
            System.out.println((String) name);
        }
        System.out.println("***************using iterator********************");
        Iterator<String> i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }



    }
}

