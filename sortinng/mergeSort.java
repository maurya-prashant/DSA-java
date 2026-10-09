import java.util.*;

public class mergeSort{

    static int[] sort(int[] arr) {

        // Base condition
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // Divide
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } 
            else {
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        // Remaining elements of first
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Remaining elements of second
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


   //using auxiallary space
   static void sort(int[] arr, int start, int end) {

        // Base condition
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Sort left half
        sort(arr, start, mid);

        // Sort right half
        sort(arr, mid + 1, end);

        // Merge both halves
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements from right
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements back
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
    public static void main(String[] args) {

        // int[] arr = {5, 3, 8, 1, 2, 7};

        // int[] sorted = sort(arr);

        // System.out.println(Arrays.toString(sorted));



        //auxiliary 
        int[] arr = {5, 3, 8, 1, 2, 7};

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
} 