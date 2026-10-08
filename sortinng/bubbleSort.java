
import java.util.Arrays;

public class bubbleSort{

    public int[] bubble(int[] arr) {

        int end = arr.length;
        boolean swap;

        for (int i = 0; i < end; i++) {

            swap = false;

            for (int j = 0; j < end - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                }
            }

            // Already sorted
            if (!swap) {
                break;
            }
        }

        return arr;
    }


}
