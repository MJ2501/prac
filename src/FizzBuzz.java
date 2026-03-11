/**
 * FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] args) {

        String output = "";
        for(int i = 1; i < 101; i++){
            if (i % 3 == 0)
                output += "Fizz";

            if (i % 5 == 0) 
                output += "Buzz";

            if(i % 3 != 0 && i % 5 != 0)
                output += Integer.toString(i);
            System.out.println(output);
            output = "";
        }  
    }
}

/*
 * In python:
 * output = ''
 * for i in range(1,101):
 *    if i % 3 == 0:
 *        output += 'Fizz'
 *    if i % 5 == 0:
 *        output += 'Buzz'
 *    if i % 3 != 0 and i % 5 != 0:
 *        output = i
 *    print(output)
 */