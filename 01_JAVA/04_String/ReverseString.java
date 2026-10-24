public class ReverseString {
    static void main(String[] args) {
        String s1 = "abhishek";

        for(int i = 0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println();
        String reverseStr = "";
        for(int i = s1.length()-1;i>=0;i--){
            reverseStr +=s1.charAt(i)+" ";

        }
        System.out.print(reverseStr);
    }
}
