package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
        // Operator logika --> Operasi yang bisa kita lakukan pada tipe data boolean
        // AND, OR, XOR, Negasi
        boolean a, b, c;

        // AND | dan
        System.out.println("-------OR (||)");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // OR | atau
        System.out.println("-------AND (&&)");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR | Exlusive or
        System.out.println("-------XOR (^)");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // Not | flipping |
        System.out.println("-------NEGASI (!)");
        a = true;
        c = !a;
        System.out.println(a + " --> ! = " + c);
        a = false;
        c = !a;
        System.out.println(a + " --> ! = " + c);
    }

    public static void boolAnd(boolean a, boolean b){
        boolean c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
    }
}
