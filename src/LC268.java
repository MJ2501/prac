import java.util.Arrays;

public class LC268 {
    public static void main(String[] args) {
        runTest(new int[]{3, 0, 1}, 2);
        runTest(new int[]{0, 1}, 2);
        runTest(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8);
        runTest(new int[]{0}, 1);
        runTest(new int[]{1}, 0);
        runTest(new int[]{0, 1, 2, 3, 4, 6, 7, 8, 9, 10}, 5);
        runTest(new int[]{}, 0);
        runTest(new int[]{2, 1}, 0);
        runTest(new int[]{1, 2}, 0);
    }

    private static void runTest(int[] nums, int expected) {
        int actual = missingNumber(nums);
        System.out.println("Input:    " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("Pass:     " + (actual == expected));
        System.out.println();
    }

    public static int missingNumber(int[] nums){
        int arrSum = 0;
        for (int i : nums) {
            arrSum += i;
        }
        return (nums.length * (nums.length+1))/2 - arrSum;
    }
}
