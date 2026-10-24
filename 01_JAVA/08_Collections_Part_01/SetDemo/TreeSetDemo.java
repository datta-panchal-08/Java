package SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(89);
        nums.add(78);
        nums.add(25);
        nums.add(14);
        nums.add(10);

        System.out.println("TreeSet : "+nums); // The Output Will Be Shown In Increasing Order
    }
}
