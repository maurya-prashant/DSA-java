public class peakOfMountain {
    
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


    void main() {
        int[] arr = {1,2,3,5,7,6,4};
        System.out.println(mountain(arr));
    }
}
