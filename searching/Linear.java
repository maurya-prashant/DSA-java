package searching;

public class Linear {
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){

                //value found at i index
                return i;
            }
        }
        //if terget value not found then -1
        return -1;
    }
    void main() {
        int[] arr={23,45,3,-11,78,7,5};
        int target = 1;

        System.out.println(linearsearch(arr, target));
    }
}
