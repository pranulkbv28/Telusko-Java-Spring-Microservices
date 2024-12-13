package Java.ObjectOrientedProgramming;

class A {
    public void show() {
        System.out.println("Method A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Method B");
    }
}

class C extends B {
    public void show() {
        System.out.println("Method C");
    }
}

public class PolymorphismInJava {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // this is an example of run-time polymorphism
    }
}
