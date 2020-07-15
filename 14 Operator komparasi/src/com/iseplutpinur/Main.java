package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
	    // Operator komparasi atau perbandingan dan hasilnya boolean

        int a, b; // bisa juga menggunakan float
        // Operator equal atau persamaan
        System.out.println("---PERSAMAAN");
        a = 10;
        b = 10;
        System.out.printf("%d == %d --> %s\n", a, b, (a == b));
        a = 10;
        b = 12;
        System.out.printf("%d == %d --> %s\n", a, b, (a == b));

        // Operator not equal atau per tidak samaan
        System.out.println("---PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        System.out.printf("%d != %d --> %s\n", a, b, (a != b));
        a = 10;
        b = 12;
        System.out.printf("%d != %d --> %s\n", a, b, (a != b));

        // Operator les than atau kurang dari
        System.out.println("---KURANG DARI");
        a = 10;
        b = 10;
        System.out.printf("%d < %d --> %s\n", a, b, (a < b));
        a = 10;
        b = 12;
        System.out.printf("%d < %d --> %s\n", a, b, (a < b));

        // Operator greater than atau lebih dari
        System.out.println("---LEBIH DARI");
        a = 10;
        b = 10;
        System.out.printf("%d > %d --> %s\n", a, b, (a > b));
        a = 10;
        b = 12;
        System.out.printf("%d > %d --> %s\n", a, b, (a > b));

        // Operator les than equal atau kurang dari sama dengan
        System.out.println("---KURANG DARI SAMA DENGAN");
        a = 10;
        b = 10;
        System.out.printf("%d <= %d --> %s\n", a, b, (a <= b));
        a = 10;
        b = 12;
        System.out.printf("%d <= %d --> %s\n", a, b, (a <= b));

        // Operator greater than equal atau lebih dari dengan
        System.out.println("---LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 10;
        System.out.printf("%d >= %d --> %s\n", a, b, (a >= b));
        a = 10;
        b = 12;
        System.out.printf("%d >= %d --> %s\n", a, b, (a >= b));


    }
}
