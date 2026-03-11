import java.util.Arrays;

class App {

    public static void main(String[] args) {
        char[] chars = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        System.out.println(compress(chars));
        System.out.println(Arrays.toString(chars));
    }

    public static int compress(char[] chars) {
        String s = "";
        int charCount = 1;
        if (chars.length == 1) {
            return 1;
        }
        s += chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                charCount += 1;
            } else {
                if (charCount > 1)
                    s += charCount;
                s += chars[i];
                charCount = 1;
            }
        }
        if (charCount != 1) {
            s += charCount;
        }
        char[] char2 = s.toCharArray();
        for (int j = 0; j < char2.length; j++) {
            chars[j] = char2[j];
        }
        return chars.length;
    }

    class Person{ // encapsulation
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    class Animal{ // inheritance
        void eat(){
            System.out.println("Animal eats food");
        }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Dog barks");
        }
    }

    class MathU{ // polymorphism(compile time)
        int add(int a, int b){
            return a+b;
        }

        double add(double a, double b){
            return a+b;
        }
    }

    class Animals{ // polymorphism(runtime)
        void makeS(){
            System.out.println("Animal makes sound");
        }
    }

    class Cat extends Animal{
        void makeS(){
            System.out.println("Cat makes sound");
        }
    }

    abstract class Shape{
        abstract void draw();
    }

    class Circle extends Shape{
        void draw(){
            System.out.println("Drawing a circle");
        }
    }
}