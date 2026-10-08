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
    static void LinearSearch(int arr[], int index){

         
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(SortedArr(arr, 0));
    }
}
