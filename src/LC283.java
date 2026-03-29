import java.util.Arrays;

public class LC283 {

    public static void main(String[] args) {
        moveZeroes(new int[]{1,5,0,3,0,4});
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
}
