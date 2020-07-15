package com.iseplutpinur;

public class Main {
    // Fungsi dalam Java disebut Method, karena berhubungan dengan Class

    // di bawah ini juga termasuk method
    public static void main(String[] args) {
        System.out.println("ini berada dalam method");

        int y,x;
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        // misal kalau mau ganti rumus, tinggal ganti di methodnya aja
    }

    public static int hitung(int input){
        int hasil;

        hasil = (input + 2) * input;

        return hasil;
    }
}
