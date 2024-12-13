package Java.ObjectOrientedProgramming;

class Calculator {
    public int add(int a, int b) { // this is a method with a return type of int
        return a + b;
    }

    public int add(int a, int b, int c) { // this is called method overloading as it is the same name but different
                                          // parameters
        return a + b + c;
    }

    public void sub(int a, int b) { // this is a method which does not return anything
        System.out.println(a - b);
    }

    public double sub(double a, int b) { // this is also a type of method overaloading as the type of parameters are
                                         // different
        return a - b;
    }
}

public class TypesOfMethods {
    public static void main(String[] args) {

    }
}
