package com.muhammet;

import java.util.Scanner;

public class Runner_For_Ornek8 {
    public static void main(String[] args) {
        /**
         * f(x,y) = x^y gibi bir fonksiyon olsun, burada işlem
         * x üzeri y şeklinde sonuç veren bir fonksiyon. Buna göre
         * x ve y kullanıcıdan alınarak sonucu bulan for döngüsünü yazınız.
         * 5^3 (5 üzeri 3) => 125 = 5*5*5
         *
         * 7^5 => 7 * 7 * 7 * 7 * 7
         */
        Scanner sc = new Scanner(System.in);
        int x, y, sonuc=1;
        System.out.print("Lütfen sayıyı giriniz.....: ");
        x = sc.nextInt();
        System.out.print("lütfen üst değeri giriniz.:   ");
        y = sc.nextInt();

        for(int i=0;i<y;i++){ // y kadar döngü kuruyoruz.
            sonuc *= x;
        }
        System.out.println(x+"^"+y+" = "+sonuc);
    }
}
