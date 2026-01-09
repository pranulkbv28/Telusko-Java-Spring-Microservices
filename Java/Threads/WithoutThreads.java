package Java.Threads;

class A {
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from A");
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from B");
        }
    }
}

public class WithoutThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}
