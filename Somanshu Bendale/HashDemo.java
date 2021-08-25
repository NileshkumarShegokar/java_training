import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {

        public String name;
            public HashDemo(String name)
        {
            this.name=name;
        }

        @Override
        public int hashCode()
        {
            return 1;
        }

        @Override
        public boolean equals(final Object obj)
        {
            HashDemo hashDemo=(HashDemo) obj;
            return (this.name.equalsIgnoreCase(hashDemo.name));
        }

        public static void main(String[] args)
        {
            Set s=new HashSet();
            HashDemo h1=new HashDemo("Somi");
            HashDemo h2=new HashDemo("Somi");
            HashDemo h3=new HashDemo("Danger");
            HashDemo h4=new HashDemo("Danger");

            s.add(h1);
            s.add(h2);
            s.add(h3);
            System.out.println("size : " +s.size());

            Iterator iterator = s.iterator();
            while(iterator.hasNext())
            {
                System.out.println("Elements : " +iterator.next());
            }
        }
}
