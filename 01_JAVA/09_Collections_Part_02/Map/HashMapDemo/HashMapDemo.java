package Map.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        map.put(null,13); // It Accepts null as a key
        System.out.println(map.get("Three"));
        System.out.println(map.values());
        System.out.println("KeySet : "+map.keySet());
        System.out.println("All Entries : "+map.entrySet());

         for (Map.Entry<String,Integer> entry:map.entrySet() ){
             System.out.println("Key : "+entry.getKey()+", Value : "+entry.getValue());
         }

        System.out.println("---------------------- With For Each ------------------------");

         // Java 8
        map.forEach((key,val)->{
            System.out.println("Key : "+key+", Value : "+val);
        });

    }
}
