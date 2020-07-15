package com.iseplutpinur;

public class Main {
    public static void main(String[] args) {
	    // Program untuk mengkonversi dari satu tipe data ke tipe data yang lain
        int nilaiInt = 450;
        System.out.println("Nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih besar
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte = " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);
        // Byte, short, int, long

        // casting pembagian
        float a = 10;
        int b = 4;
        float c = a/b;
        System.out.printf("%f / %d = %f\n", a, b, c);
        // initinya jika salasatu jadi float maka hasilnya akan float jika var c nya float

        int x = 10;
        int y = 4;
        float z = (float)a/b;
        System.out.printf("%d / %d = %f\n", x, y, z);
        // dicasting dulu jadi float terus di operasi kan
    }
}
