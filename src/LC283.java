import java.util.Arrays;

public class LC283 {

    public static void main(String[] args) {
        runTest("Mixed zeroes", new int[]{1, 5, 0, 3, 0, 4}, new int[]{1, 5, 3, 4, 0, 0});
        runTest("Already ordered", new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        runTest("All zeroes", new int[]{0, 0, 0}, new int[]{0, 0, 0});
        runTest("Leading zeroes", new int[]{0, 0, 1, 2}, new int[]{1, 2, 0, 0});
        runTest("Trailing zeroes", new int[]{1, 2, 0, 0}, new int[]{1, 2, 0, 0});
        runTest("Alternating zeroes", new int[]{0, 1, 0, 2, 0, 3}, new int[]{1, 2, 3, 0, 0, 0});
        runTest("Single zero", new int[]{0}, new int[]{0});
        runTest("Single non-zero", new int[]{7}, new int[]{7});
        runTest("Empty array", new int[]{}, new int[]{});
        runTest("Negative values", new int[]{-1, 0, -2, 0, 3}, new int[]{-1, -2, 3, 0, 0});
    }

    private static void runTest(String label, int[] nums, int[] expected) {
        int[] inputForMoveZeroes = Arrays.copyOf(nums, nums.length);
        int[] inputForMoveZeroes1 = Arrays.copyOf(nums, nums.length);

        moveZeroes(inputForMoveZeroes);
        moveZeroes1(inputForMoveZeroes1);

        System.out.println(label);
        System.out.println("Input:              " + Arrays.toString(nums));
        System.out.println("Expected:           " + Arrays.toString(expected));
        System.out.println("moveZeroes actual:  " + Arrays.toString(inputForMoveZeroes));
        System.out.println("moveZeroes pass:    " + Arrays.equals(inputForMoveZeroes, expected));
        System.out.println("moveZeroes1 actual: " + Arrays.toString(inputForMoveZeroes1));
        System.out.println("moveZeroes1 pass:   " + Arrays.equals(inputForMoveZeroes1, expected));
        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        int i = -1;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                i = k;
                break;
            }
        }
        if (i == -1)
            return;
        int j = i + 1;
        while (j <= nums.length - 1) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes1(int[] nums) {
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }
        for(int i = nonZero; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
