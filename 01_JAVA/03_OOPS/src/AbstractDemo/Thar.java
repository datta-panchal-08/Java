package AbstractDemo;

public class Thar extends  Vechicle{
    Thar(String brand){
        super(brand);
    }
    @Override
    void start(){}

    static void main(String[] args) {
        Thar t = new Thar("Mahindra");
        t.m1();
    }
}
