//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> City = new LinkedList<>();
        City.add("Pune");
        City.add("Mumbai");
        City.add("Alandi");
        System.out.println(City);

        City.remove("Alandi");
        System.out.println(City);
    }
}