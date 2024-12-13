package Java.ObjectOrientedProgramming;

@FunctionalInterface // this is used to tell that the interface can have only one method
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void show(int i);
}

@FunctionalInterface
interface Calc {
    int add(int a, int b);
}

public class LambdaExpressionsInJava {
    public static void main(String[] args) {
        A a1 = new A() {
            public void show() {
                System.out.println("in A1 show");
            }
        };
        a1.show();

        A a2 = () -> {
            System.out.println("in A2 show");
        };
        a2.show();

        A a3 = () -> System.out.println("in A3 show");
        a3.show();

        // the second and the third are examples of lambda functions

        B b1 = new B() {
            public void show(int i) {
                System.out.println("in B show " + i);
            }
        };
        b1.show(1);

        B b2 = (int i) -> {
            System.out.println("in B2 show " + i);
        };
        b2.show(2);

        B b3 = (i) -> System.out.println(("in B3 show " + i));
        b3.show(3);

        B b4 = i -> System.out.println(("in B4 show " + i));
        b4.show(4);

        // these are the other types of lambda expressions

        Calc calc1 = new Calc() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        calc1.add(1, 2);

        Calc calc2 = (int a, int b) -> {
            return a + b;
        };
        calc2.add(2, 3);

        Calc calc3 = (a, b) -> a + b;
        calc3.add(3, 4);

        // other forms of lamda expressions

    }
}
