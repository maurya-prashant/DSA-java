public class evendigit{
    static int findnumber(int[] nums){
        int count =0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        
        return count;
    }

    //function to check is func contain even or no even digit
    static boolean even(int num){
        int numofdigit = digits(num);

        // if(numofdigit%2==0){
        //     return true;
        // }
        return numofdigit%2==0;
    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0){
            num=num*(-1);
        }
        if(num==0){
            return 1;
        }
        
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    void main(){

        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumber(nums));
    }
}