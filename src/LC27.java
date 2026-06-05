import java.util.Arrays;

public class LC27 {
    public static void main(String[] args) {
        LC27 solution = new LC27();
        runTest(solution, new int[]{3, 2, 2, 4}, 3);
        runTest(solution, new int[]{3, 2, 2, 3}, 3);
        runTest(solution, new int[]{1, 2, 3, 4}, 5);
        runTest(solution, new int[]{2, 2, 2, 2}, 2);
        runTest(solution, new int[]{0}, 0);
        runTest(solution, new int[]{7}, 3);
        runTest(solution, new int[]{4, 1, 4, 2, 4, 3}, 4);
        runTest(solution, new int[]{1, 1, 2, 3, 1, 4}, 1);
        runTest(solution, new int[]{5, 6, 7, 8, 9}, 5);
        runTest(solution, new int[]{5, 6, 7, 8, 9}, 9);
    }

    private static void runTest(LC27 solution, int[] nums, int val) {
        System.out.println("Input:  " + Arrays.toString(nums) + ", val = " + val);
        try {
            int count = solution.removeEle(nums, val);
            System.out.println("Count:  " + count);
            System.out.println("Output: " + Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println("Error:  " + e);
        }
        System.out.println();
    }

    public int removeEle(int[] nums, int val){
        int count = 0;
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
