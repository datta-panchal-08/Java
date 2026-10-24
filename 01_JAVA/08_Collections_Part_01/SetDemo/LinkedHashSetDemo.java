package SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Dattaray");
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Mangesh");
        names.add("Mahesh");

        System.out.println("Names Set : "+names);
    }
}
