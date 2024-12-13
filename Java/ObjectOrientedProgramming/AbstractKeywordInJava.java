package Java.ObjectOrientedProgramming;

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

// if a class extends to an abstract class, it must implement all the abstract
// methods of the abstract class
// if there is a an abstract method in the parent, but the functionality is not
// yet created, you can make it abstract too
abstract class WagonR extends Car {

    public void drive() {
        System.out.println("drive");
    }
}

class UpdatedWagonR extends WagonR { // classes without "abstract" keywords are called "concrete" class
    public void fly() {
        System.out.println("fly");
    }
}

public class AbstractKeywordInJava {
    public static void main(String[] args) {
        // Car obj = new Car(); // we cannot create an object of an abstract car
        // WagonR obj = new WagonR(); // now, since even WagonR is an abstract class, we
        // will have to create an object with another class
        UpdatedWagonR obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}
