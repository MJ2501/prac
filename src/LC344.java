import java.util.Arrays;

public class LC344 {
    public static void main(String[] args) {
        LC344 solution = new LC344();
        runTest(solution, new char[]{'h', 'e', 'l', 'l', 'o'});
        runTest(solution, new char[]{'H', 'a', 'n', 'n', 'a', 'h'});
        runTest(solution, new char[]{'a', 'b'});
        runTest(solution, new char[]{'z'});
        runTest(solution, new char[]{});
        runTest(solution, new char[]{'1', '2', '3', '4', '5'});
        runTest(solution, new char[]{'A', ' ', 'b', '!'});
    }

    private static void runTest(LC344 solution, char[] input) {
        char[] testCase = Arrays.copyOf(input, input.length);
        System.out.println("Input:  " + Arrays.toString(testCase));
        reverseString(testCase);
        System.out.println("Output: " + Arrays.toString(testCase));
        System.out.println();
    }

    public static void reverseString(char[] str){
        int l = 0;
        int r = str.length - 1;
        while(l < r){
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
    }
}
