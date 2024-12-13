package Java.ConditionalStatements;

public class SwitchStatements {
    public static void main(String[] args) {
        char grade = 'A';

        // Suggested code may be subject to a license. Learn more:
        // ~LicenseLog:3811019420.
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
