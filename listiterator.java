import java.util.*;

public class listiterator {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        ListIterator<String> fruitsIterator=fruits.listIterator();
        while(fruitsIterator.hasNext()) {
            String fruit = fruitsIterator.next();
            if (fruit.equals("Apple")) fruitsIterator.set("blueberry");
        }
            fruitsIterator.previous();
        System.out.println(fruits);

        }
    }

