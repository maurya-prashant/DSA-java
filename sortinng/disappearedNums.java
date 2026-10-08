import java.util.ArrayList;
import java.util.List;

public class disappearedNums {
    
    public List<Integer> findDisappearedNumbers(int[] arr){
        int i=0;
        while(i<arr.length){
           int correct = arr[i]-1;

            //check if index is == correct
            if(arr[i]!=arr[correct]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            }
            else{
                i++;
            }
        }
        //search for missing number
        List<Integer> ans = new ArrayList<>();
        for(int index =0; index<arr.length; index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }
}
