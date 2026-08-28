package searching;

public class String_search {
    static boolean stringsearch(String str, char target){

        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

        
        // using foreach
        //creating an char array
        // for (char ch : str.toCharArray()) {
        //     if(ch==target){
        //         return true;
        //     }
        // }
        // return false;
    }
    void main() {
        String name="Riddhima";
        char target = 'z';
        System.out.println(stringsearch(name, target));

       //System.out.println(Arrays.toString((name.toCharArray())));
    }
    
}
