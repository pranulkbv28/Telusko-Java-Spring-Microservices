package Java.ObjectOrientedProgramming;

abstract class A {
    public void show() {
        System.out.println("in A show");
    }

    public abstract void abstractShow();
}

public class AnonymousInnerClassesInJava {
    public static void main(String[] args) {
        // A a = new A();
        // a.show();
        // here, if we want to override the show method, where we might be only doing it
        // once, we can use something called annonymous inner class
        A a = new A() {
            public void show() {
                System.out.println("in A inner class show");
            }

            public void abstractShow() {
                System.out.println("in A inner class abstract show");
            } // we can also make the class an abstract class and implement the abstract
              // classes in the annonymous inner classes
        };
        a.show();
        a.abstractShow();
    }
}
