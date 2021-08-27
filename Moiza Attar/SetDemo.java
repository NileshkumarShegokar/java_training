import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo{

            public String name;
            public SetDemo(String name)
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
                SetDemo sd=(SetDemo) obj;
                return (this.name.equalsIgnoreCase(sd.name));
            }

            public static void main(String[] args)
            {
                Set s=new HashSet();
                SetDemo s1=new SetDemo("Moiza");
                SetDemo s2=new SetDemo("Moiza");
                SetDemo s3=new SetDemo("Attar");

                s.add(s1);
                s.add(s2);
                s.add(s3);
                System.out.println("size : " +s.size());

                Iterator iterator = s.iterator();
                while(iterator.hasNext())
                {
                    System.out.println("Elements : " +iterator.next());
                }
            }
}
