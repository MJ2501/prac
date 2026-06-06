import java.util.Arrays;

public class LC121 {
    public static void main(String[] args) {
        runTest(new int[]{7, 1, 5, 3, 6, 4}, 5);
        runTest(new int[]{7, 6, 4, 3, 1}, 0);
        runTest(new int[]{1, 2, 3, 4, 5}, 4);
        runTest(new int[]{2, 4, 1}, 2);
        runTest(new int[]{3, 3, 3, 3}, 0);
        runTest(new int[]{5}, 0);
        runTest(new int[]{}, 0);
        runTest(new int[]{2, 1, 2, 1, 0, 1, 2}, 2);
    }

    private static void runTest(int[] prices, int expected) {
        int actual = maxProfit(prices);
        System.out.println("Input:    " + Arrays.toString(prices));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println("Pass:     " + (actual == expected));
        System.out.println();
    }

    public static int maxProfit(int[] prices){
        int max = 0;
        if(prices.length == 0) return max;
        int min = prices[0];
        for(int i = 1;i<prices.length; i++){
            if(max < prices[i] - min) max = prices[i] - min;
            if(min > prices[i]) min = prices[i];
        }
        return max;
    }

}
