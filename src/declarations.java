import java.util.HashMap;
import java.util.Scanner;

public class declarations {
    // Variables
    // 8 primitive types
    int n = 121212;
    short m = 1212;
    long l = 123123123;

    double k = 3.1232;
    float f = 3.14f;
    char c = 'y';
    boolean b = true;
    byte bt = 127;

    String g;

    // Input
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int intinput = scan.nextInt();

    // Type Conversion
    // Int to Str
    int n = 5;
    String m = Integer.toString(n);
    // Java also considers "" as marking a string and '' as a character
    // 5 + ' ' returns 37 whereas 5 + " " gives 5 and a blank space

    // Data Structures
    // Array 
    int[] a;
    // Hashmap
    HashMap<Integer, String> map = new HashMap<Integer, String>();
}
