package com.muhammet;

public class Runner_For {
    public static void main(String[] args) {
        /***
         * Klasik for kullanımı
         */
        for (int i = 0; i < 10; i++) {

        }

        /**
         * DİKKAT!!!!!
         * bir for döngüsünün gövdesi her zaman {} ler ile belirtilmek
         * zorunda değildir. Yani {} olmadan da for döngüsü tek satır bir
         * kodu kendi gövdesinde işletebilir. Burada dikkat etmeniz gereken
         * husus, for döngüşü ile ; arasında kalan alanın for un gövdesi
         * olarak kabul edilmesidir.
         */
        //for (int i = 0; i < 10; i++) System.out.println("Muhammet HOCA"); System.out.println("Başka bir değer");


        for (int i = 0; i < 10; i++);{
            System.out.println("Muhammet HOCA");
            System.out.println("Başka bir değer");
        }
//          Sonsuz for döngüsü
//        for(;;){
//            System.out.println("Durdurun bu döngüyü artık");
//        }
        int dongu=0;
        for(;dongu<6;){
            System.out.println("Ekrana çıktı...");
            dongu++;
        }

    }
}
