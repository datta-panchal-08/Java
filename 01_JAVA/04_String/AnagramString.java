import java.util.Arrays;

public class AnagramString {
    static void main(String[] args) {
        String str1 = "silent";
        String str2 = "violen";

        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(str1.length() != str2.length() ){
            System.out.println("Not Anagram");
        }

        if(Arrays.equals(arr1,arr2)){
            System.out.println("String is anagram");
        }else{
            System.out.println("Not Anagram");
        }


    }
}
