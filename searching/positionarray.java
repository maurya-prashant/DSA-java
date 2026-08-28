public class positionarray {

    static int ans(int[] arr, int target){
        // first find range
        //start with a box of size 2
        int start =0;
        int end =1;

        //condition for the target to lie in the range
        while(target < arr[end]){
            int newstart=end+1;
            //double the box(end = prev end + size of box*2)
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

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
    void main() {
        
    }
}
