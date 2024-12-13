package Java.ObjectOrientedProgramming;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class OOPsBasics {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "Phone";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 50000;
        Mobile.name = "Smart Phone";
        obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);

        // here, we are seeing how static keyword is being utilised for variables and
        // for methods
    }
}
