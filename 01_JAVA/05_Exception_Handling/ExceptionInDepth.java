public class ExceptionInDepth {
    static void main(String[] args) {
        m1();
    }

    static  void m1 (){
        m2();
        System.out.println("Hello jii m1");
    }

    static  void m2 (){
        m3();
        System.out.println("Hello jii m2");
    }

    static  void m3(){
        System.out.println(10/0);
        System.out.println("Hello jii m3");
    }
}
