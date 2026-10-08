public class duplicateNum {

    public int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            if (arr[i] != i + 1) {

                int correctIndex = arr[i]-1;

                if (arr[i] != arr[correctIndex]) {

                    // swap
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;

                } else {
                    // duplicate found
                    return arr[i];
                }

            } else {
                i++;
            }
        }

        return -1;
    }
}