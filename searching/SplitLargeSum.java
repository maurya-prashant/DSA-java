import java.util.*;

public class SplitLargeSum {
   
    public int splitArray(int[] nums, int m){
        int start =0;
        int end= 0;
        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the arra
            end += nums[i];
        }

        //binary search
        while(start<end){
            // try for the mid as potential ans
            int mid = start +(end-start)/2;

            //calculate how many pieces you can divide this inn with this with max sum
            int sum =0;
            int pieces = 1;
            for(int num : nums){
                if(sum+ num>mid){
                    //you should add this in this subarray, make new one
                    // say you add this in new subarray then sum=num
                    sum = num;
                    pieces++;
                }
                else{
                    sum+= num;
                }
            }
            if(pieces>mid){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }

        return end;  // here start == end
    }
}
