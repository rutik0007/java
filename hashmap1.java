import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        System.out.println(map);

        System.out.println("Search the key :"+map.get(1));
    }
}
