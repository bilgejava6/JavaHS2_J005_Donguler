package com.muhammet;

public class Main {
    public static void main(String[] args) {
        /**
         * LOOP -
         * for loop
         * syntax => for([1. alan tanım];[2. alan koşul];[3. alan değiştirme]){
         *     // tekrara girecek kod for döngüsünün gövdesine yazılır.
         * }
         * For döngüsünün devam edebilmesi için orta[2. alan] da bulunan
         * koşulun doğru olması gereklidir. Koşul doğru olduğu sürece
         * döngü devam eder.
         */
        /**
         * step1-> değişken tanımlanır. int i=0; - koşul kontrol edilir. i<1000, sonra kod çalışır
         * step2-> değişkenin değeri arttırılır, koşul kontrol edilir.
         * ......
         * koşul sağlanmadı anda döngüden çıkar.
         */
        for (int i=0;i<6;i++){
            System.out.println("Muhammet HOCA");
        }
    }
}