package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(12);
        nums.add(24);
        nums.add(36);
        nums.add(36);
        nums.add(48);
        nums.add(60);

        System.out.println("Set : "+nums);
    }
}
