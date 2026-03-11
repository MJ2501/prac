public class TNH {
    public static int findDuplicate(int[] nums){
        int tortoise = nums[0];
        int hare = nums[0];
        while (true){
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare){
                break;
            }
        }
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr;
        arr = new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
}
