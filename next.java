import java.util.HashMap;
import java.util.Map;

public class next{
    public static void main(String[] args) {

        Map<String, Integer> harsh = new HashMap<>();
        System.out.println("Students value : ");

        harsh.put("Pundir", 23);
        harsh.put("Rohit",45);
        System.out.println(harsh.get("Pundir"));
        System.out.println("Completed...");
    }
}