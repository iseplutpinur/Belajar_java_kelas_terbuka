package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
	    // unary adalah operasi yang dilakukan pada satu variable
        int angka = 1;

        // unary - dan +
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);

        // unary increment dan decrement
        int angka2 = 10;
        System.out.printf("Nilai dengan '++' %d menjadi %d\n", angka2, ++angka2);
        System.out.printf("Nilai dengan '--' %d menjadi %d\n", angka2, --angka2);

        // type unary increment dan decremen
        // posfix dan prefix
        // posfix angka2++ angka ditampilkan terlebih dahulu kemudian ditambahkan
        // prefix ++angka2 angka ditambahkan terlebih dahulu kemudian ditampilkan

        // unary bolean dengan ! untuk negasi
        boolean benar = true;
        System.out.println("Nilai boolean = " + benar);
        System.out.println("Nilai boolean = " + !benar);
    }
}
