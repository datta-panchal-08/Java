public class CountVowelsAndConstants {
    static void main(String[] args) {
        String name = "aeroplane";
        int v =0,c = 0;

        for(char ch:name.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) !=-1){
               v++;
            }else{
                c++;
            }
        }

        System.out.println("Vowels For : "+name+" Is "+v);
        System.out.println("Consonants For : "+name+ " Is "+c);
    }
}
