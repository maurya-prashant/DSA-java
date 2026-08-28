package strings;

public class practice {

    static void printstring(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
   
    static int countLength(String str){
        int count = 0;
        for(char ch: str.toCharArray()){
            count++;
        }
        return count;
    }

    static int countVowel(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }


    static String reverseString(String str){
        String reverse = "";
        int n =str.length();
        for(int i=n-1; i>=0; i++){
            char ch = str.charAt(i);
            reverse = reverse+ch;
        }
        return reverse;
    }

    static boolean  pallindrome(String str){
        String original = str;
        String reverse = reverseString(original);

        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }

        return true;
    }
    
    void main() {
        //print each charater of the string
        //String str = "aero";
        //printstring(str);

        //count each string 
        // countLength(str);
        //System.out.println(countLength(str));

        //cunt vowels
        //System.out.println(countVowel(str));

        //reverse string
        //System.out.println(reverseString(str));

        //pallindrome
        System.out.println(pallindrome("lola"));

    }
}
