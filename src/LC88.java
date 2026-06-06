import java.util.Arrays;

public class LC88 {
    public static void main(String[] args) {
        LC88 solution = new LC88();

        runTest(solution, new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
        runTest(solution, new int[]{1}, 1, new int[]{}, 0, new int[]{1});
        runTest(solution, new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
        runTest(solution, new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2});
        runTest(solution, new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6});
        runTest(solution, new int[]{1, 1, 1, 0, 0, 0}, 3, new int[]{1, 1, 1}, 3, new int[]{1, 1, 1, 1, 1, 1});
        runTest(solution, new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[]{1, 2, 2}, 3, new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3});
    }

    private static void runTest(LC88 solution, int[] nums1, int m, int[] nums2, int n, int[] expected) {
        int[] nums1Copy = Arrays.copyOf(nums1, nums1.length);
        int[] nums2Copy = Arrays.copyOf(nums2, nums2.length);

        int[] actual = solution.sortedMergedArrays(nums1Copy, m, nums2Copy, n);

        System.out.println("nums1:    " + Arrays.toString(nums1));
        System.out.println("m:        " + m);
        System.out.println("nums2:    " + Arrays.toString(nums2));
        System.out.println("n:        " + n);
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));
        System.out.println("Pass:     " + Arrays.equals(actual, expected));
        System.out.println();
    }

    public int[] sortedMergedArrays(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }else{
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

        return nums1;
    }
}
