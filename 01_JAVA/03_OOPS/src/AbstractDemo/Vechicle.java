package AbstractDemo;

public abstract class Vechicle {
    String brand;

    Vechicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    public void m1(){
        System.out.println("Hello From M1...");
    }
}
