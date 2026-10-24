package TreeSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

// Data class
class Master {

    int age;
    String name;

    Master(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age : " + age + " name : " + name;
    }
}

// Comparator class
class AgeComparator implements Comparator<Master> {

    @Override
    public int compare(Master m1, Master m2) {
        return Integer.compare(m1.age, m2.age);
    }
}

// Main class
public class ComparatorDemoTreeSet {

    public static void main(String[] args) {

        // Comparator object TreeSet ko pass kiya
        TreeSet<Master> mens =
                new TreeSet<>(new AgeComparator());

        mens.add(new Master(29, "Dnyaneshwar"));
        mens.add(new Master(24, "Dattatray"));
        mens.add(new Master(27, "Mohaneshwar"));
        mens.add(new Master(25, "Ganesh"));

        for (Master m : mens) {
            System.out.println(m);
        }
    }
}