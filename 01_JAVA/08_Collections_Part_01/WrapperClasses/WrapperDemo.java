package WrapperClasses;

public class WrapperDemo {
    static void main(String[] args) {
        Integer n = Integer.valueOf(10); // Autoboxing
        int i = n; // Unboxing
        System.out.println(i);
        int obj = Integer.parseInt("34567");
        System.out.println("Integer From String : "+obj);
        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);

        Double d = 9.9879;
        int i3 = d.intValue();
        System.out.println(i3);

        Integer in = 56790;
        String s = in.toString();
        System.out.println(s);

        Integer a = 67;
        Integer b = 67;

        System.out.println(a==b); // -128 to 127 // 67 in range thats why it is true

        Integer a1  = 200;
        Integer b1 = 200;
        System.out.println(a1 == b1);
    }
}
