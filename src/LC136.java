import java.util.Arrays;

public class LC136 {
    public static void main(String[] args) {
        runTest(new int[]{2, 2, 1}, 1);
        runTest(new int[]{4, 1, 2, 1, 2}, 4);
        runTest(new int[]{1}, 1);
        runTest(new int[]{-1, -1, -2}, -2);
        runTest(new int[]{0, 1, 0}, 1);
        runTest(new int[]{7, 3, 5, 4, 5, 3, 4}, 7);
        runTest(new int[]{-10, 14, 14, 6, 6}, -10);
        runTest(new int[]{9, 9, 8, 7, 7, 6, 6}, 8);
    }

    private static void runTest(int[] nums, int expected) {
        int actual = singleNumber(nums);
        System.out.println("Input:    " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("Pass:     " + (actual == expected));
        System.out.println();
    }

    public static int singleNumber(int[] nums){
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
