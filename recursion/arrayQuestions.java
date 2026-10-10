
import java.util.ArrayList;

public class arrayQuestions {

    //check for sorted array
    static boolean SortedArr(int[] arr, int index){

        //base condition
        if(index==arr.length - 1 ){
            return true;
        }

        return arr[index]< arr[index+1] && SortedArr(arr, index + 1);

    }

    //linear Serach
    static boolean LinearSearch(int arr[], int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || LinearSearch(arr, target, index+1);

    }

    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndexLast(arr, target, index-1);
        }
    }

    // recursion to find all occurrences of a target in an array and store their indexes in an ArrayList.
    Static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
           list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // 
    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
           list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }


    // return an arraylist
    

    void main() {
        
        int[] arr = {1, 2, 3, 4, 5};
        IO.println(SortedArr(arr, 0));
    }
}
