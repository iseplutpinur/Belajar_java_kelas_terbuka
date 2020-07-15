package com.iseplutpinur;

import java.util.Scanner;
public class Coba {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int n = cin.nextInt();
        long angka = 1;
        for (int i = 1; i<=n; i++){
            System.out.printf("Nilai ke \t%d : %d\n", i-1, angka+angka);
            angka += angka;
        }
    }
}
