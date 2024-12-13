package Java.ObjectOrientedProgramming;

interface Computer {
    int price = 2000;
    String name = "Apple";
    // in an interface all the variables are final and static
    // this means that they are constant and also can be used without an object

    void code();
}
// in an interface, by default all the methods are public astract

interface Service {
    void needsService();
}

class Desktop implements Computer, Service {
    public void code() {
        System.out.println("Desktop is coding");
    }

    public void needsService() {
        System.out.println("Desktop needs service");
    }
}

class Laptop implements Computer, Service {
    public void code() {
        System.out.println("Laptop is coding");
    }

    public void needsService() {
        System.out.println("Laptop needs service");
    }
}
// when using the methods of an interface we connect the class and the interface
// using the keyword "implements"
// as with abstract classes, even when your class implements an interface, all
// the methods need to be implemeted
// a singular class can also implement multiple interfaces

class Developer {
    void writeCode(Computer comp) {
        comp.code();
    }
}

public class InterfaceKeywordInJava {
    public static void main(String[] args) {

        // Computer comp = new Computer(); // we cannot do this because Computer is an
        // interface

        Computer comp1 = new Desktop();
        Computer comp2 = new Laptop();

        Developer dev = new Developer();
        dev.writeCode(comp1);
        dev.writeCode(comp2);
        // Computer.name = "Samsung"; // this is not possible as it is a final field
        System.out.println(Computer.price);
        System.out.println(Computer.name);
    }

    // class to class -> extends
    // class to interface -> implements
    // interface to interface -> extends
}
