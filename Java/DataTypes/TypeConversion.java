package Java.DataTypes;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = 257;

        // b = a, this is not possible as byte has a smaller range
        // a = b, is possible as int can accomodate the value of b

        b = (byte) a; // this is called explicit conversion
        a = b; // this is implicit conversion
        System.out.println(b + " " + a); // here, we will get 1 1 as the output because when the range is exceeding,
                                         // modulo operator is used and the remainder is returned
    }
}
