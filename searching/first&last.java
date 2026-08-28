public class first&last {

    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        //check for the first occcurance if the target is first 

        int start = search(nums, target, true );
        int end = search(nums, target, false);
        

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this function returns the index value of target 
    int search(int[] nums, int target, boolean findstartindex){

        int ans =-1;
        int start =0;
        int end=nums.length-1;

        while(start<=end){
            //find teh mid element
            // int mid =(start+end)/2;
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1; // go left
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                // potential ans found
                ans = mid;
                if(findstartindex==true){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return ans;
        
    }
    void main() {
        
    }
}
