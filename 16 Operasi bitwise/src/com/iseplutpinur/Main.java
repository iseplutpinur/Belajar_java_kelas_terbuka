package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
	    // Operator bitwise --> Opertor untuk melakukan operasi pada nilai bit
        byte a = 3;
        byte b;
        byte c;
        // Operator Shift left
        System.out.println("=============SHIFT LEFT(<<)");
        b = (byte)(a << 1);
        display(a);
        display(b);

        // Operator Shift right
        System.out.println("\n=============SHIFT RIGHT(>>)");
        a = 24;
        b = (byte)(a >> 1);
        display(a);
        display(b);

        // Operator OR
        System.out.println("\n=============OR(|)");
        a = 24;
        b = 12;
        c = (byte)(a | b);
        display(a);
        display(b);
        System.out.println("---------------OR");
        display(c);

        // Operator AND
        System.out.println("\n=============AND(&)");
        a = 24;
        b = 12;
        c = (byte)(a & b);
        display(a);
        display(b);
        System.out.println("---------------AND");
        display(c);

        // Operator XOR
        System.out.println("\n=============XOR(^)");
        a = 24;
        b = 12;
        c = (byte)(a ^ b);
        display(a);
        display(b);
        System.out.println("---------------XOR");
        display(c);

        // Operator NOT
        System.out.println("\n=============NOT(~)");
        a = 12;
        b = (byte)(~a);
        display(a);
        System.out.println("---------------NOT");
        String a_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n\n",a_bits ,b);
        a = 24;
        b = (byte)(~a);
        display(a);
        System.out.println("---------------NOT");
        a_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n\n",a_bits ,b);
    }

    public static void display(int a, int b){
        String a_bits = String.format("%" + b + "s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits ,a);
    }

    public static void display(int a){
        String a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n",a_bits ,a);
    }
}
