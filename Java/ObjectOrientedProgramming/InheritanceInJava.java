package Java.ObjectOrientedProgramming;

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        // super(5); // here, the paramterised constructor of A is called
        // this(5); // here, the paramterised constructor of B is called
        System.out.println("in B");
    }

    public B(int n) {
        // super(n); // here, the parameterised constructor of A is called
        // this(); // here, the default constructor of class B is called
        System.out.println("in B int");
    }
}

public class InheritanceInJava {
    B obj = new B();
    // when you create an object of B, it will call the contsructor its class and
    // its super class
    // here, B is the class and A is the super class
    // the reason this is because, every constructor in Java has a method called
    // "super()" which when called, calls the constructor of the super class

    B obj1 = new B(2);
    // here, the parameterised constructor of B is called and the default
    // constructor of A but not the paramterised constructor of A
}
