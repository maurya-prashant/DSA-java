package searching;

import java.util.Arrays;

public class searchin2darray {
    static int[] search(int[][] arr, int target) {

        // Traverse every row
        for (int i = 0; i < arr.length; i++) {

            // Traverse every column in the current row
            for (int j = 0; j < arr[i].length; j++) {

                // Target found
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // Target not found
        return new int[]{-1, -1};
    }
    // static int max(int[][] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int[] ints: arr){
    //         for(int element:ints){
    //             if(element>max){
    //                 max=element;
    //             }
    //         }
    //     }
    //     return max;
    // }
    void main() {
        int[][] arr ={
            {1,2,3,4},
            {12,13,14,15,16},
            {56,78,89,90},
            {34,32,}
        };
        int target = 78;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        //System.out.println(max(arr));
    }
}
