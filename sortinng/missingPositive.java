public class missingPositive {
        public int firstMissinngPositive(int[] arr){
            int i=0;
            while(i<arr.length){
            int correctIndex = arr[i]-1;

                //check if index is == correct
                if(arr[i]>0 && arr[i]<=arr.length && arr[i]!= arr[correctIndex]){

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;

                }
                else{
                    i++;
                }
            }
            //search for first missing
            for(int index =0; index<arr.length; index++){
                if(arr[index] != index+1){
                    return index+1;
                }
            }

            //case 2
            return arr.length+1;
        }
}
