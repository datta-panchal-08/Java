public class Car {
    String color;
    String brand;
    int speed;

   public static void main() {
      Car c = new Car();
      c.speed = 100;
      c.run();
    }

    public void run(){
        System.out.println("Car is running at "+speed);
    }
}
