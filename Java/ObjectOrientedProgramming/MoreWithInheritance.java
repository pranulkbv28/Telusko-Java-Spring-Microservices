package Java.ObjectOrientedProgramming;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvancedCalculator extends Calculator { // here, AdvancedCalculator is a subclass of Calculator which is the super
                                              // class
                                              // this is an example of single level inheritance
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class VeryAdvancedCalculator extends AdvancedCalculator { // here, if it extends only Calculator, then
                                                          // VeryAdvancedCalculator will have only the methods of
                                                          // Calculator and itself
    // but, since we are extending to AdvancedCalculator, we are getting the methods
    // of Calculator, AdvancedCalculator and VeryAdvancedCalculator
    // this is also an example of multi-level inheritance
    public int mod(int a, int b) {
        return a % b;
    }

    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

// a single class can inherit only from 1 parent class and multiple

class A {
    public void show() {
        System.out.println("Method A");
    }
}

class B extends A {
    public void show() { // this is an exampe of method overriding
        // what happens here is that even though class A has a method called "show",
        // since this method is there in the child, this method will be called
        // unlike method overloading, where we can create methods of same name but
        // parameters or types of parameters are to be different
        // in method overriding, we can have both the methods having every
        // characteristic the same
        System.out.println("Method B");
    }
}

public class MoreWithInheritance {
    public static void main(String[] args) {
        VeryAdvancedCalculator obj = new VeryAdvancedCalculator();
        int sum = obj.add(10, 20);
        int sub = obj.sub(10, 20);
        int mul = obj.mul(10, 20);
        int div = obj.div(10, 20);
        int mod = obj.mod(10, 20);
        double power = obj.power(10, 20);
        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);
        System.out.println("Power: " + power);

        B obj2 = new B();
        obj2.show();
    }
}
