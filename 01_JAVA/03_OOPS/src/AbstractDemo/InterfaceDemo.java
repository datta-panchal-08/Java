package AbstractDemo;

interface Camera {
    void click();
}

interface Music {
    void play();
}

class Phone implements Camera, Music {

    public void click() {
        System.out.println("Photo clicked");
    }

    public void play() {
        System.out.println("Music playing");
    }
}

public class InterfaceDemo{
    static void main(String[] args) {
       Phone p = new Phone();
       p.click();
       p.play();
    }
}


