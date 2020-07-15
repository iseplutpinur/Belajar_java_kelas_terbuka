package com.iseplutpinur;

public class Main {

    public static void main(String[] args) {
        // void itu artinya hampa
        // tipe data kosong. gak ada apa-apa
        // jadi gak perlu pake return

        System.out.println(simpel());
        fungsiVoid("Hello Mantan");
        selamatPagi("Dia");
        selamatPagi("Diamu");
    }

    private static void fungsiVoid(String input) {
        // ini adalah fungsi tanpa kembalian
        // hanya mendelegasikan sebuah aksi saja
        // ga ada nilai yang dikembalikan

        System.out.println(input);
    }

    private static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama + " anjing");
    }

    private static float simpel() {
        // ini adalah fungsi atau method dengan kembalian
        // sehingga menggunakan return untuk mengembalikan nilainya (10.0F)
        return 10.0F;
    }
}
