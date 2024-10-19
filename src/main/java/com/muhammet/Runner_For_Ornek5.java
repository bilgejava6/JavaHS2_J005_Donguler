package com.muhammet;

import java.util.Scanner;

public class Runner_For_Ornek5 {
    public static void main(String[] args) {
        /**
         * kullanıcıdan alınan Ad bilgisi ve adının kaç defa yazdırılması bilgisi ile
         * kullanıcının adını istenilen miktarda ekrana yazdıran kodu yazınız.
         * > adınız...: Muhammet HOCA
         * > tekrar sayısıs: 7
         * Muhammet HOCA
         * Muhammet HOCA
         * Muhammet HOCA
         * Muhammet HOCA
         * Muhammet HOCA
         * Muhammet HOCA
         * Muhammet HOCA
         *
         */
        int tekrarSayisi;
        String ad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen adınınızı giriniz....: ");
        /**
         * next() -> sadece ilk girilen tümleşik değeri okur.
         * nextLine() -> ilgili satıra girilen tüm değeri okur.
         */
        ad = sc.nextLine();
        System.out.print("Adınız kaç defa tekrar edicek...: ");
        tekrarSayisi = sc.nextInt();

        for(int i=0; i<tekrarSayisi;i++){
            System.out.println(ad);
        }

    }
}
