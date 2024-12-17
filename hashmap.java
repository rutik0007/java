import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        System.out.println(map.get("A"));
        map.remove("B");
                System.out.println(map.get("B"));
    }
}
