// Java Program to Illustrate Use of Binary Literals
public class BinaryLiteralsDemo {
    public static void main(String[] args) {
        // Byte type Binary Literals
        byte a1 = 0b011; // Binary 011 is decimal 3
        byte a2 = 0B101; // Binary 101 is decimal 5
        System.out.println("Binary Literal in Byte:");
        System.out.println("a1 = " + a1 + ", a2 = " + a2);

        // Short type Binary Literals
        short b1 = 0b101; // Binary 101 is decimal 5
        short b2 = 0B111; // Binary 111 is decimal 7
        System.out.println("Binary Literal in Short:");
        System.out.println("b1 = " + b1 + ", b2 = " + b2);

        // Int type Binary Literals
        int c1 = 0b011; // Binary 011 is decimal 3
        int c2 = 0B111; // Binary 111 is decimal 7
        System.out.println("Binary Literal in Integer:");
        System.out.println("c1 = " + c1 + ", c2 = " + c2);

        // Long type Binary Literals
        long d1 = 0b0000011111100011; // Binary 0000011111100011 is decimal 2019
        long d2 = 0B0000011111100001; // Binary 0000011111100001 is decimal 2017
        System.out.println("Binary Literal in Long:");
        System.out.println("d1 = " + d1 + ", d2 = " + d2);
    }
}
