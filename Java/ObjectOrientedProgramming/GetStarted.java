package Java.ObjectOrientedProgramming;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class GetStarted {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // here we are creating an object of Calculator class
        int sum = calc.add(10, 20); // this is how you call a method of a class
        System.out.println("Sum: " + sum);
        int diff = calc.sub(10, 20);
        System.out.println("Difference: " + diff);
    }
}
