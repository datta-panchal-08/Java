import java.util.LinkedList;

public class LinkedListDemo {
    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Dattaray");
        ll.add("Mohneshwar");
        ll.add("Dnyaneshwar");
        ll.add("Ganesh");

        System.out.println("LinkedList : "+ll);

        // We Can Fecth Like This
        String first = ll.getFirst();
        String last = ll.getLast();

        System.out.println("First Element : "+first);
        System.out.println("Last Element : "+last);

        System.out.println(ll.get(3));// It will Starts a loop and access the element from there
    }
}
