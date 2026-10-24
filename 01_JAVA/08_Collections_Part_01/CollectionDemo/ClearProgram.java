package CollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClearProgram {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 numbers To Add In List..");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<=5;i++){
            int number = sc.nextInt();
            nums.add(number);
        }
        System.out.println(nums);
        if(nums.isEmpty()){
            System.out.println("List is Empty..");
        }else {
            System.out.println("List is not empty..");
        }
         nums.clear();
        System.out.println(nums);

        if(nums.isEmpty()){
            System.out.println("List is Empty..");
        }else {
            System.out.println("List is not empty..");
        }

    }
}
