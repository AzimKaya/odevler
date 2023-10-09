package ekim_H1;

import java.util.Scanner;

public class e06Baklava {

    public static void main(String[] args) {
        /*
 Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *
           şeklini konsola yazdiriniz.
 */
        int sekil = 7;

        // Baklava ustu
        for (int i = 1; i <= sekil; i++) {//Satir
            for (int j = 1; j <= sekil - i; j++) {//Sutun

                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }

        // Baklava alti
        for (int i = sekil - 1; i >= 1; i--) {

            for (int j = 1; j <= sekil - i; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

}