package com.iseplutpinur;

public class Function {
    public static void main(String[] args) {
        // Operator logika --> Operasi yang bisa kita lakukan pada tipe data boolean
        // AND, OR, XOR, Negasi
        boolean a, b, c;

        // AND | dan
        cout("-------OR (||)");
        boolAnd(false, false);
        boolAnd(false, true);
        boolAnd(true, false);
        boolAnd(true, true);

        // OR | atau
        cout("\n-------AND (&&)");
        boolOr(false, false);
        boolOr(false, true);
        boolOr(true, false);
        boolOr(true, true);

        // XOR | Exlusive or
        cout("\n-------XOR (^)");
        boolXor(false, false);
        boolXor(false, true);
        boolXor(true, false);
        boolXor(true, true);

        cout("\n-------NOT (^)");
        // Not | flipping |
        boolNot(true);
        boolNot(false);
    }

    public static void boolOr(boolean a, boolean b){
        cout(a + " || " + b + " = " + (a || b));
    }
    public static void boolAnd(boolean a, boolean b){
        cout(a + " && " + b + " = " + (a && b));
    }
    public static void boolXor(boolean a, boolean b){
        cout(a + " ^ " + b + " = " + (a ^ b));
    }
    public static void boolNot(boolean a){
        cout(a + " --> ! = " + !a);
    }
    public static void cout(String a){
        System.out.println(a);
    }
}
