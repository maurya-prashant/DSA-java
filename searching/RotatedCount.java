public class RotatedCount {

    static int countRotations(int[] arr) {

        int pivot = findPivot(arr);

        // Array is already sorted
        if (pivot == -1) {
            return 0;
        }

        // Number of rotations = pivot index + 1
        return pivot + 1;
    }


    // Find index of the largest element
    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // mid - 1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Left half is sorted,
            // so pivot must be on the right
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }

            // Pivot is on the left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
}