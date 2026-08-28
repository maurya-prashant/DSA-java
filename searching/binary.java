public class binary {

   //when the array is sorted in acsending order
    static int bsearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<= end){
            int mid =start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    //when we dont know if the array is sorted ascending or descending
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        //find if the array is sorted in asc or desc
        boolean isAsc=arr[start] < arr[end];

        while(start<= end){
            int mid =start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

           if(isAsc){    //if the array is in ascending 
             if(target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
           }
            else{        //if the array is in descending
                if(target>arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            }
        }

        return -1;
    }

    void main(){
         int[] arr={9,8,7,6,3,1};
         int target = 6;

         int ans=bsearch(arr, target);
         //System.out.println(ans);

         
         int order=orderAgnosticBS(arr, target);
         System.out.println(order);

    }    

    
}
