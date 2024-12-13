package Java.ObjectOrientedProgramming;

// here we see how the "final" keyword is used for a variable, method and class

final class Calculator {
    public void show() {
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// class AdvancedCalculator extends Calculator {
// } this is not possible as the class Calculator has final keyowrd, which
// basically prohibits any other class to inherit its properties

class MyCalculator {
    public final void show() {
        System.out.println("by Pranaav");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvancedCalculator extends MyCalculator {
    // public void show() {
    // System.out.println("by Jhon");
    // } here, since the "show" method has the final keyword in the super class, no
    // subclass can override the method
}

/*
 * final keyword
 * for a vairable -> it makes it a constant
 * for a method -> it makes sure it cannot be overriden
 * for a class -> it makes sure it cannot be inherited
 */

public class FinalKeywordInJava {
    public static void main(String[] args) {
        final int num = 8;
        // num = 9; // this is wrong because, when we use the "final" keyword for a
        // variable it is stating that this is the only calue that the variable will
        // hold throughout the code.
        System.out.println(num);
    }
}
