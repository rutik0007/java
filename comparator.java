import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        Integer[]number={5,8,9,2,4,1};
        Arrays.sort(number,new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(number));
    }
}
