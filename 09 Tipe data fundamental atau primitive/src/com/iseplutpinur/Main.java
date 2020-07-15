package com.iseplutpinur;

public class Main {
    public static void main(String[] args){
        // tipe data di java
        // integer, byte, short, long, double, float, char, boolean

        // integer adalah nilai bualat(satuan) tidak mempunyai koma
        int a = 10;
        System.out.println("===INTEGER===");
        System.out.println("Nilai integer i = " + a);
        System.out.println("Nilai max " + Integer.MAX_VALUE);
        System.out.println("Nilai min " + Integer.MIN_VALUE);
        System.out.println("Besar integer " + Integer.BYTES + " Bytes");
        System.out.println("Besar integer " + Integer.SIZE + " Bit");

        // 1 byte = 8 bit
        // 4 byte = 32 bit
        // 2^(31) -1
        // jika nilai integer melebihi nilai maksimal maka akan kembali ke negatif berputar ke belakang

        byte i = 10;
        System.out.println("\n===BYTE===");
        System.out.println("Nilai Byte i = " + i);
        System.out.println("Nilai max " + Byte.MAX_VALUE);
        System.out.println("Nilai min " + Byte.MIN_VALUE);
        System.out.println("Besar byte " + Byte.BYTES + " Bytes");
        System.out.println("Besar byte " + Byte.SIZE + " Bit");

        short b = 10;
        System.out.println("\n===SHORT===");
        System.out.println("Nilai short i = " + b);
        System.out.println("Nilai max " + Short.MAX_VALUE);
        System.out.println("Nilai min " + Short.MIN_VALUE);
        System.out.println("Besar short " + Short.BYTES + " Bytes");
        System.out.println("Besar short " + Short.SIZE + " Bit");

        long c = 10L;
        System.out.println("\n===LONG===");
        System.out.println("Nilai long i = " + c);
        System.out.println("Nilai max " + Long.MAX_VALUE);
        System.out.println("Nilai min " + Long.MIN_VALUE);
        System.out.println("Besar long " + Long.BYTES + " Bytes");
        System.out.println("Besar long " + Long.SIZE + " Bit");

        double d = 10.5d; // (koma, bilangan real)
        System.out.println("\n===DOUBLE===");
        System.out.println("Nilai double i = " + d);
        System.out.println("Nilai max " + Integer.MAX_VALUE);
        System.out.println("Nilai min " + Integer.MIN_VALUE);
        System.out.println("Besar double " + Integer.BYTES + " Bytes");
        System.out.println("Besar double " + Integer.SIZE + " Bit");

        float e = 10.5F; // (koma, bilangan real)
        System.out.println("\n===FLOAT===");
        System.out.println("Nilai Float i = " + e);
        System.out.println("Nilai max " + Float.MAX_VALUE);
        System.out.println("Nilai min " + Float.MIN_VALUE);
        System.out.println("Besar Float " + Float.BYTES + " Bytes");
        System.out.println("Besar Float " + Integer.SIZE + " Bit");

        char f = 'c'; // berdasarkan ASCII
        System.out.println("\n===CHAR===");
        System.out.println("Nilai Char i = " + f);
        System.out.println("Nilai max " + Character.MAX_VALUE);
        System.out.println("Nilai min " + Character.MIN_VALUE);
        System.out.println("Besar Char " + Character.BYTES + " Bytes");
        System.out.println("Besar Char " + Character.SIZE + " Bit");

        boolean g = true; //nilainya true atau false
        System.out.println("\n===BOOLEAN===");
        System.out.println("Nilai Boolean i = " + g);

        //String merupakan tipe data hight level, string terdiri dari beberapa character nilainya bisa berubah ubah

    }
}
