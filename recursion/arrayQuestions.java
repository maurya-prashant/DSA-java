
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

    // return arraylist
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
           list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }


    //return the list without passing argument
    // return type will be arraylist
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        //this will contain ans for that function call only

        if(arr[index]==target){
           list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }

    //rotated binary search using recursion
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target <= arr[m]){
                return search(arr, target, s, m-1);
            }
            else{
                return search(arr, target, m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }

    void main() {
        
        int[] arr = {2,3,1,4,4,5};
        // IO.println(SortedArr(arr, 0));
        
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        IO.println(ans);
    }
}
