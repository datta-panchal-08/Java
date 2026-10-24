package Map.SortedMapDemo;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        // 1. put() - Key-value pair add karta hai
        map.put(104, "Ganesh");
        map.put(101, "Dattatray");
        map.put(103, "Dnyaneshwar");
        map.put(102, "Mohaneshwar");
        map.put(105, "Rahul");

        System.out.println("Map : " + map);


        // 2. get() - Key ki value return karta hai
        System.out.println("Get 102 : " + map.get(102));


        // 3. containsKey() - Key present hai ya nahi check karta hai
        System.out.println("Contains Key 103 : "
                + map.containsKey(103));


        // 4. containsValue() - Value present hai ya nahi check karta hai
        System.out.println("Contains Value Ganesh : "
                + map.containsValue("Ganesh"));


        // 5. size() - Total entries batata hai
        System.out.println("Size : " + map.size());


        // 6. isEmpty() - Map empty hai ya nahi check karta hai
        System.out.println("Is Empty : " + map.isEmpty());


        // 7. keySet() - Saari keys return karta hai
        System.out.println("Keys : " + map.keySet());


        // 8. values() - Saari values return karta hai
        System.out.println("Values : " + map.values());


        // 9. entrySet() - Saare key-value pairs return karta hai
        System.out.println("Entries : ");

        for (SortedMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    "Key : " + entry.getKey()
                            + ", Value : " + entry.getValue()
            );
        }


        // -------- SortedMap Special Methods --------


        // 10. firstKey() - Sabse first/smallest key deta hai
        System.out.println("First Key : " + map.firstKey());


        // 11. lastKey() - Sabse last/largest key deta hai
        System.out.println("Last Key : " + map.lastKey());


        // 12. headMap() - Given key se chhoti keys ka map deta hai
        System.out.println("Head Map : " + map.headMap(103));


        // 13. tailMap() - Given key se lekar aage ka map deta hai
        System.out.println("Tail Map : " + map.tailMap(103));


        // 14. subMap() - Do keys ke beech ka map deta hai
        System.out.println("Sub Map : "
                + map.subMap(102, 105));


        // 15. comparator() - Sorting ke liye used comparator deta hai
        System.out.println("Comparator : " + map.comparator());


        // 16. remove() - Given key ki entry remove karta hai
        map.remove(105);

        System.out.println("After Remove : " + map);


        // 17. clear() - Saari entries remove karta hai
        map.clear();

        System.out.println("After Clear : " + map);

    }

}
