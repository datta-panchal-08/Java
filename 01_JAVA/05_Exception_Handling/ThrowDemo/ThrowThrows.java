package ThrowDemo;

public class ThrowThrows {
    static void main(String[] args)  {
       try {
           checkAgeCalc(19);
       } catch (Exception e) {
           System.out.println("Exception Failed : "+e.getMessage());
       }
    }

    public static void checkAgeCalc(int age) throws Exception {
        if(age<0){
            throw new Exception("Age Cannot Be Negative..");
        }
        if(age<18){
            throw new Exception("You are underage");
        }else{
            System.out.println("You Can Vote Now ");
        }

    }

}
