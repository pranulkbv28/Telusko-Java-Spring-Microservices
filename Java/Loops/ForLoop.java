package Java.Loops;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        // Nested For Loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World");
            }
        }

        // Enhanced for loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
