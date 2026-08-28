package searching;

public class min_element {

    
    static int min(int[] arr){

        // Edge case: empty array
        if (arr.length == 0) {
            return -1; // or throw an exception
        }


        int min=arr[0]; //assume first element is minimun

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    void main() {
        int[] arr ={18,12,7,3,14,28};
        System.out.println(min(arr));
    }
}
