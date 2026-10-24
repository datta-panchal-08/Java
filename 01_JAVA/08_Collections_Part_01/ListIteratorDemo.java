import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);

        ListIterator<Integer> number = nums.listIterator();

        // Forward Direction
        while (number.hasNext()) {

            int num = number.next();

            if (num == 70) {
                number.set(67);
            }
        }

        System.out.println(nums);

        System.out.println("Backward Direction");

        while (number.hasPrevious()) {

            int num = number.previous();

            System.out.println("Previous : " + num);
        }
    }
}