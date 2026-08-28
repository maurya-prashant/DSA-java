package practise;

public class max_item {
    static int   maxnum(int[] arr, int start, int end){

        //edge case1
        if(start>end){
            return -1;
        }
        //edge case2
       if (arr == null || arr.length == 0) {
            return -1;
        }

        //when edge cases were not involved

    //    int max = arr[0];
    //    for(int i=0; i<arr.length; i++){
    //     if(arr[i]>max){
    //         max = arr[i];
    //     }
        
    //    }

    //when edge cases are involved
    int max = arr[start];

    for (int i = start; i <= end; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
       return max;
       
    }
    void main() {
        int[] arr ={2,3,4,6,22,1};
       System.out.println(maxnum(arr, 0, 5));
    }
}
