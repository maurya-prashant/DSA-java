public class SearchInMountain {

    static int search(int[] arr, int target){
        int peak = mountain(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int mountain(int[] arr){

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
       
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

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

}
}
