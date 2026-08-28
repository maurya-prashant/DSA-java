
public class optimizedeven {

    static int findnum(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int numofdigit = digits(num);
        return numofdigit % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * (-1);
        }

        return (int)(Math.log10(num)) + 1;
    }

    void main() {
        int[] nums = {12,345, 2,6, 7890};
        System.out.println(findnum(nums));
    }
}