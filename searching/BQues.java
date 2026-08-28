public class BQues {


    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Exact match
            if (arr[mid] == target) {
                return mid;
            }

            // Target is greater, search right
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // Target is smaller, search left
            else {
                end = mid - 1;
            }
        }

        // start points to the smallest element >= target
        return start;
    }

    static int floor(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        //if target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<=target){
                start = mid+1; // go right
            }
            else{
                end = mid-1; //go left
            }

        }
        return end;
    }
    void main() {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20; 

        // System.out.println(ceiling(arr, target));

        System.out.println(floor(arr, target));
    }
}
