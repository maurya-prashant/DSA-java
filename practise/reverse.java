package practise;

import java.util.Arrays;

public class reverse {
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reversearr(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    void main() {
        int[] arr ={1,3,13,9,18};

        reversearr(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
