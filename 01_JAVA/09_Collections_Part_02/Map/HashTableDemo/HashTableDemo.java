package Map.HashTableDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new Hashtable<>();

        map.put(101, "Dattatray");
        map.put(102, "Mohaneshwar");
        map.put(103, "Dnyaneshwar");
        map.put(104, "Ganesh");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    "Key : " + entry.getKey() +
                            ", Value : " + entry.getValue()
            );
        }
    }
}