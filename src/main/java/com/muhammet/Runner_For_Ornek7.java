package com.muhammet;

import java.util.Scanner;

public class Runner_For_Ornek7 {
    public static void main(String[] args) {
        /**
         * Kullanıcının vermiş olduğu sınırlarda ki sayıların toplamını
         * bulan kodu yazınız.
         * ÖRN:
         * toplam için başlangıç...: 20
         * toplam için bitiş.......: 100
         * toplam....: xxxx
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz...: ");
        int baslangic = sc.nextInt();
        System.out.println("Bitiş değerini giriniz........: ");
        int bitis = sc.nextInt();
        int toplam = 0;
        for (int i = baslangic; i<=bitis; i++){
            toplam += i;
        }
        System.out.println("toplam...: "+ toplam);
    }
}
