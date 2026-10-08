public class duplicateRotatedArr {

    static int Bsearch(int[] nums, int target) {

        int pivot = search(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // Target is the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // Target is in the left sorted part
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Target is in the right sorted part
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }


    static int search(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1:
            // mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2:
            // mid - 1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3:
            // Duplicates make it impossible to know
            // which side contains the pivot.
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                // Check whether start itself is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                // Check whether end-1 is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                // Skip duplicates
                start++;
                end--;
            }

            // Left side is sorted
            else if (arr[start] <= arr[mid]) {

                // Pivot must be on the right
                start = mid + 1;
            }

            // Right side contains the pivot
            else {

                end = mid - 1;
            }
        }

        return -1;
    }


    static int binarysearch(
            int[] arr,
            int target,
            int start,
            int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}





//leetcode approach short version

class Solution {

    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate case:
            // Cannot determine which side is sorted
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // Left half is sorted
            else if (nums[start] <= nums[mid]) {

                // Target lies inside left sorted half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside right sorted half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}