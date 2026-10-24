public class PalindromeString {
    static void main(String[] args) {
        String name = "12121";
        int count = 0;
        String revString = "";

        for(int  i = name.length() - 1; i>=0;i--){
           revString+=name.charAt(i);
        }

        if(revString.equals(name)){
            System.out.println("String Is Palindrome..");
        }else{
            System.out.println("Not Palindrome..");
        }
    }
}
