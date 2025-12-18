package Java.LocalVariableTypeInference;

// import java.util.ArrayList;

class Student {

}

public class LVTIInJava {

    // var d = 10; // this is not possible as var cannot be used with instance
    // variables

    public static void main(String[] args) {
        // var obj = new ArrayList<>(); // this is how you use LVTI in Java

        // but keep in mind, that it can only be used for local variables, and not
        // instance variables
        // instance variables are the variables declared in classes, and local variables
        // are
        // the variables declared inside methods

        int a = 9;
        var b = 8;
        // int c;
        // var b; // this is not possible and it will cause compile time error
        String var = "Pranaav"; // var can also be as a variable as it is not a reserved keyword

        var nums = new int[5]; // this is how you use LVTI to make an array
        // you do not need to use "[]" when using LVTI
        // var nums2[] = new int[5]; // this is wrong

        var obj = new Student();

        System.out.println(a);
        System.out.println(b);
        System.out.println(var);
        System.out.println(nums);
        System.out.println(obj);
    }
}
