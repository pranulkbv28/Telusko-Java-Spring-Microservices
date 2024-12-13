package Java.DataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 126; // 1 byte -> 8 bits
        short s = 130; // 2 bytes
        int num = 13000000; // 4 bytes
        long l = 14000000000000l; // 8 bytes
        // the above 4 come under Integer data types

        float f = 16.2323f; // 4 bytes
        double d = 23.47476475; // 8 bytes and has more precision than float
        // the above 2 come under FLoat data types

        boolean bool = true;
        bool = false;

        char c = 'a'; // 2 bytes

        System.out.println(b + " " + s + " " + num + " " + l + " " + f + " " + d + " " + bool + " " + c);
    }
}
