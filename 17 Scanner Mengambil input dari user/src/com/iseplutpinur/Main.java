package com.iseplutpinur;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // Menghitung luas persegi panjang
        System.out.println("Menghitung luas persegi panjang");
        System.out.print("Masukan Nilai Panjang: ");
        int panjang = cin.nextInt();
        System.out.print("Masukan Nilai Lebar  : ");
        int lebar  = cin.nextInt();
        System.out.printf("Luas = %d", panjang * lebar);
    }
}
