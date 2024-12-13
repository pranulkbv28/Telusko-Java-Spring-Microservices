package Java.ObjectOrientedProgramming;

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    MacBook(2000), Dell(2200), Lenovo(1500), HP, Acer(700);

    private int price;

    private Laptop() {
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumsInJava {
    public static void main(String[] args) {
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Success:
                System.out.println("Success");
                break;
            default:
                System.out.println("Invalid Status");
        }

        // Laptop lap = Laptop.MacBook;

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
