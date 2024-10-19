package com.muhammet;

import java.util.Scanner;

public class Runner_While_Loop {
    public static void main(String[] args) {
        /**
         * while(condition){}
         * while parantezi doğru olduğu sürece döngü devam eder.
         */
        int secim = 0;
        Scanner sc = new Scanner(System.in);
        while(secim!=0){ // 1,2,3,4 ten birisini seçmesi, 0 seçilmez ise devam et
            System.out.println("""
                    ***********************************
                    ******       İŞLEMLER        ******
                    1- Toplama
                    2- Çıkartma
                    3- Çarpma
                    4- Bölme
                    5- Mod Alma
                    6- Üst Alma
                    7- Karakök Alma
                    8- Logoritma
                    0- << Ç I K I Ş >>
                    """);
            System.out.print("Lütfen seçiniz...........: ");
            secim = sc.nextInt();
        }
    }
}
