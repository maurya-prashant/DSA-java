public class rotatedArray{

    static int Bsearch(int[] nums, int target){
        int pivot = search(nums);

        // if pivot not found means array isn not rotated
        if(pivot == -1){
            //just do normal search
            return binarysearch(nums, target, 0,nums.length-1);
        }

        // if pivot found, you have 2 asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }

        // target is in the left sorted part
        if(target>=nums[0]){
            return binarysearch(nums, target, 0, pivot-1);
        }

        // target is in the right sorted part
        return binarysearch(nums, target, pivot+1, nums.length-1);
    }


    // find the pivot
    static int search(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            //4 cases

            if(mid<end && arr[mid]>arr[mid+1]){   //case 1  mid<end in case of out of bounnd array
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){   // case 2
                return mid-1;
            }
            if(arr[mid]<=arr[start]){  //case 3
                end=mid-1;
            }
            else{  // case 4
                start=mid+1;
            }
        }
        return -1;

    }

    

    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end= mid-1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    void main(){

       
    }
}