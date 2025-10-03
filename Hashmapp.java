import java.util.*;

public class Hashmapp {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 20);
        mp.put("Yash", 19);

        System.out.println(mp.get("Akash"));

        //remove pair from hashmap
        System.out.println(mp.remove("Akash"));

        System.out.println(mp.containsKey("Akash"));

        mp.putIfAbsent("Yashika", 19);

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());  
    }
}
