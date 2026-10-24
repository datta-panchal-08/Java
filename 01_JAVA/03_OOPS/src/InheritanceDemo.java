public class InheritanceDemo {
    static void main(String[] args) {

    }

    void eat(){
        System.out.println("Animal is eating...");
    }

    void sound(){
        System.out.println("Making Sound trr.. trr..");
    }
}

class Cat extends InheritanceDemo{
    @Override
    void sound() {
        System.out.println("Making Sound Meow.. Meow..");
    }
}