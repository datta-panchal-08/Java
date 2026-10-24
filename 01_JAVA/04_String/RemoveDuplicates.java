public class RemoveDuplicates {
    static void main(String[] args) {
        String course = "kautak";// Datry
        String result = "";
        boolean duplicates = false;
        for(char ch:course.toCharArray()){

           if(result.indexOf(ch) == -1){
               result+=ch;
           }else{
               duplicates = true;
           }

        }
       if(duplicates){
           System.out.println("Removed Duplicates : "+result);
       }else{
            System.out.println("No Duplicates Found In This String : "+course);
        }
    }
}
