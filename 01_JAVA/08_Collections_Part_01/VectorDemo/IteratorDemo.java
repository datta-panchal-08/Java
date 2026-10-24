package VectorDemo;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
    static void main(String[] args) {
        Vector<Integer> vect = new Vector<>();
        vect.add(20);
        vect.add(10);
        vect.add(40);
        vect.add(59);

        Iterator<Integer> nums = vect.iterator();

        while(nums.hasNext()){
           int num = nums.next();
           if(num == 40){
               nums.remove();
           }else {
               System.out.println("Iterator : "+num);
           }
         }

    }
}
