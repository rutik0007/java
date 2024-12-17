import java.util.Enumeration;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {
        Vector<String> Fruits = new Vector<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Orange");
        Fruits.add("Pear");
        Enumeration<String> e = Fruits.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
