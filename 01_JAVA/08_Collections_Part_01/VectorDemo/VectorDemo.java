package VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    static void main(String[] args) {
        Vector<Integer> vect = new Vector<>();
        vect.add(20);
        vect.add(10);
        vect.add(40);

        Enumeration<Integer> elements = vect.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
