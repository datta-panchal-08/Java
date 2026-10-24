package FunctionalInterface;

@FunctionalInterface
interface Calc {

    int add(int a, int b);

    default void m1() {
        System.out.println("Hello From Add...");
    }
}

public class FunctionalDemo {

    public static void main(String[] args) {

        Calc c = (a, b) -> a + b;

        System.out.println(c.add(5, 10));

        c.m1();
    }
}