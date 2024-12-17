import java.util.*;
public class treemap{
    public static void main(String[]args){
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map);

        map.pollFirstEntry();
        System.out.println(map);
    }
}




