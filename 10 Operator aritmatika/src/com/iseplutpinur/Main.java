package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
        // Operator aritmatika pada java
        int var1 = 10;
        int var2 = 5;

        int hasil;

        // 1. Pertambahan
        hasil = var1 + var2;
        System.out.println("Pertambahan dari " + var1 + " + " + var2 + " = " + hasil);

        // 2. pengurangan
        hasil = var1 - var2;
        System.out.printf("Pengurangan dari %d - %d = %d\n", var1, var2, hasil);

        // 3. perkalian
        hasil = var1 * var2;
        System.out.printf("Perkalian dari %d * %d = %d\n", var1, var2, hasil);

        // 4. pembagian
        hasil = var1 / var2;
        System.out.printf("Pembagian dari %d / %d = %d\n", var1, var2, hasil);
        float a = 5;
        float b = 6;
        float hasilFloat = a/b;
        System.out.printf("Pembagian dari %f / %f = %f\n", a, b, hasilFloat);

        // 5. modulus (sisa bagi)
        hasil = var1 % var2;
        System.out.printf("Pembagian dari %d %% %d = %d\n", var1, var2, hasil);
    }
}
