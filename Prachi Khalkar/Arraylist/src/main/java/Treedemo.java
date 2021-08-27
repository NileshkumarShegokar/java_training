import java.util.Comparator;
import java.util.TreeSet;
public class Treedemo {
    public static void main(String args[]) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(21);
        s.add(32);
        s.add(44);
        s.add(11);
        s.add(54);
        System.out.println("TreeSet elements in ascending order " + s);

        TreeSet<Integer> rs = new TreeSet<>(Comparator.reverseOrder());
        rs.add(21);
        rs.add(32);
        rs.add(44);
        rs.add(11);
        rs.add(54);
        System.out.println("TreeSet elements in descending order " + rs);
    }
}
