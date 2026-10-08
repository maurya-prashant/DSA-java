public class missingNum {
    //amazon question
    

    public int missing(int[] arr){
        int i=0;
        while(i<arr.length){
           int correctIndex = arr[i];

            //check if index is == correct
            if(arr[i]<arr.length && arr[i]!= arr[correctIndex]){

                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            }
            else{
                i++;
            }
        }
        //search for first missing
        for(int index =0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        //case 2
        return arr.length;
    }



    //approach 2
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];

        }
        return n*(n+1)/2-sum;
        
    }


    
    public int miss(int[] nums) {

        int n = nums.length;  // when array is from [0-n] if [1-n] the nums.length+1
        int missing = n * (n + 1) / 2;

        for (int num : nums) {
            missing -= num;
        }

        return missing;
    }

}
