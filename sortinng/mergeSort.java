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

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2, 7};

        int[] sorted = sort(arr);

        System.out.println(Arrays.toString(sorted));
    }
} 