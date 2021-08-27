import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Arraydemo {
    public static <object> void main(String[] args) {
        ArrayList<String> l=new ArrayList();
        l.add("WEB");
        l.add("technology");
        l.add("Java");
        l.add("technology");
        System.out.println("size of list is:"+l.size());

        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }


        for(String name:l)
        {
            System.out.println((String) name);
        }

        l.forEach(name-> System.out.println(name));


    }
}
