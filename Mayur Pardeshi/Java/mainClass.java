import Pack.Child;
import Pack.Parent;

public class mainClass {
    public static void main(String[] args) {
        Child ch = new Child();
        Parent pr = new Parent();
        ch.childProp();
        pr.parentProp();
    }
}
