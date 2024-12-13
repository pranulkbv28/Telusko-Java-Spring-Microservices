package Java.ObjectOrientedProgramming;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // here, "this" keyword is used in terms of context
        // this.age points to the "age" of the Human Class
        // we are using it like this as the paramater we are using is also named "age"
        // and this is used to avoid confusion
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class EncapsulationInJava {
    public static void main(String[] args) {
        // the concept of encapsulation is making sure the data is being protected and
        // no one from the outside is able to view them

        Human obj = new Human();
        // obj.age = 22;
        // obj.name = "Pranaav";
        // this is not possible as age and name are private
        // as in, they are not accessible from outside the class Human
        // how to tackle this?
        // we make getter and setter methods
        obj.setName("Pranaav");
        obj.setAge(22);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
