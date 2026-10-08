import java.util.Arrays;

public class cyclicSort {
    

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;

            //check if index is == correct
            if(arr[i]!= arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];

                arr[correctIndex] = temp;

            }
            else{
                i++;
            }
        }
    }

    void main() {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
