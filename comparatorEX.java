import java.util.*;


public class comparatorEX {
    public static void main(String[] args) {

        Integer [] arr={4,9,5,8,3,6,};
        Arrays.sort(arr,new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;

            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
