public class NullPointerDemo {
    static void main(String[] args) {
        String s = null;

        try{
            int length = s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException "+e);
        }
    }
}
