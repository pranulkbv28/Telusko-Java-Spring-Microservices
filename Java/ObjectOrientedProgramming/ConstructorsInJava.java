package Java.ObjectOrientedProgramming;

class Human {
    // Suggested code may be subject to a license. Learn more:
    // ~LicenseLog:2258859546.
    private int age;
    private String name;

    // a constructor is a method which has the same name as that of the class
    // everytime you create an object of the Human class, the constructor is called
    // automatically
    public Human() { // this is a default constructor
        age = 12;
        name = "Jhon";
        // these will be the default values of age and name when you create an object of
        // the Human class
    }
    // if you do not create a constructor, the default constructor will be called
    // public Human(){
    // }

    // you can also perform method overloading on constructors
    // you can also pass parameters to the constructor
    public Human(int age, String name) { // this is a parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorsInJava {
    public static void main(String[] args) {
        Human obj1 = new Human();
        System.out.println(obj1.getAge() + " : " + obj1.getName());

        Human obj2 = new Human(22, "Pranaav");
        System.out.println(obj2.getAge() + " : " + obj2.getName());
    }
}
