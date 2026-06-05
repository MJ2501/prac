import java.util.Arrays;

public class LC26 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Before: " + Arrays.toString(arr));
        sortedArr(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }

    public static void sortedArr(int[] arr){
        int pos = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] != arr[pos]){
                pos++;
                arr[pos] = arr[i];
            }
        }
    }
}
