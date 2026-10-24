public class ChildParent {
    static void main(String[] args) {
        String s = null;
        try{
             int len = s.length();
        }catch (ArithmeticException e){
            System.out.println("Arithmetice Exception");
        }catch (NullPointerException e){
            System.out.println("NullpointerException..."+e);
        }
        catch (Exception e){
            System.out.println("Exception...");
        }
    }
}
