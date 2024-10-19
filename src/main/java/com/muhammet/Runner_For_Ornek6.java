package com.muhammet;

public class Runner_For_Ornek6 {
    public static void main(String[] args) {
        /**
         * 1.....7 dahil arasındaki sayıların toplamını bulan kodu yazınız.
         */
        int toplam=0;

        for(int i=1;i<=7;i++){ // step1 -> toplam=1, step2 -> toplam=3, ...
            //System.out.println(i);
            toplam = toplam + i;
            // toplam += i;
        }
        System.out.println("Toplam:"+toplam);
    }
}
