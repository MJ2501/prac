import java.util.Arrays;

public class LC485 {
    public static void main(String[] args) {
        runTest(new int[]{1, 1, 0, 1, 1, 1}, 3);
        runTest(new int[]{1, 0, 1, 1, 0, 1}, 2);
        runTest(new int[]{0, 0, 0}, 0);
        runTest(new int[]{1, 1, 1, 1}, 4);
        runTest(new int[]{0, 1, 1, 1, 0, 1}, 3);
        runTest(new int[]{1}, 1);
        runTest(new int[]{0}, 0);
        runTest(new int[]{}, 0);
        runTest(new int[]{1, 0, 1, 1, 1, 0, 1, 1}, 3);
        runTest(new int[]{0, 1, 1, 0, 1, 1, 1, 1}, 4);
    }

    private static void runTest(int[] nums, int expected) {
        int actual = findMaxConsecutiveOnes(nums);
        System.out.println("Input:    " + Arrays.toString(nums));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("Pass:     " + (actual == expected));
        System.out.println();
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                if(count > max) max = count;
                count = 0;
            }
        }
        if(count > max) max = count;
        return max;
    }
}
