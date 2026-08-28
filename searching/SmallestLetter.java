public class SmallestLetter {
    
    public char nextGreatestLetter(char[] letters, char target) {

    // if (target >= letters[letters.length - 1]) {
    //     return '\0'; // "not found"
    // }

    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target < letters[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return letters[start % letters.length];
}

    void main(){
        
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(letters, target));

    }
}
