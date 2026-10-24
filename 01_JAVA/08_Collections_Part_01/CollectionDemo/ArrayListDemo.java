package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    static void main(String[] args) {
        // Order
        // No Duplicates
        // Index Access

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(20);

        System.out.println(nums);
        System.out.println(nums.get(3));

        System.out.println(nums.size()); // to check size of list
        System.out.println(nums.remove(2)); // Remove element of index 2
        System.out.println(nums.isEmpty()); // Checks if list is Empty or not
        System.out.println(nums.contains(10));// Checks if contains or not
        System.out.println(nums.indexOf(10));// checks index of an element
        nums.set(3,78); // It Replace The elemnet of that index
        System.out.println(nums);
        nums.remove(3); // It removes element of the following index
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);
    }
}
