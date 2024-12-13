package Java.ObjectOrientedProgramming;

class A {
    public void show() {
        System.out.println("in A");
    }

    class B {
        public void config() {
            System.out.println("in B config");
        }
    }
}

public class InnerClassesInJava {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        A.B b = a.new B();
        // if class B were to be made static
        // then
        // A.B b = new A.B();
        b.config();
    }
}
