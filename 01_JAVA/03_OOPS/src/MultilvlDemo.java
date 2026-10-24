public class MultilvlDemo {

    void fly() {
        System.out.println("Flying....");
    }

    public static void main(String[] args) {

        MultilvlDemo m = new MultilvlDemo();
        m.fly();

        Animal an = new Animal();
        an.fly();

        Dog d = new Dog();
        d.fly();
    }
}

class Animal extends MultilvlDemo {

    @Override
    void fly() {
        System.out.println("Animals can't fly");
    }
}

class Dog extends Animal {

    @Override
    void fly() {
        super.fly();
        System.out.println("Dog also can't fly");
    }
}