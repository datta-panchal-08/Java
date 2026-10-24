package TreeSetDemo;

import java.util.TreeSet;

class Man implements Comparable<Man> {

    int age;
    String name;

    Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Man other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "age : " + age + " name : " + name;
    }
}

public class ComparableDemoWithTreeSet {

    public static void main(String[] args) {

        TreeSet<Man> mens = new TreeSet<>();

        mens.add(new Man(24, "Dattatray"));
        mens.add(new Man(25, "Ganesh"));
        mens.add(new Man(27, "Mohaneshwar"));
        mens.add(new Man(29, "Dnyaneshwar"));

        for (Man m : mens) {
            System.out.println(m);
        }
    }
}