package ekim_H1;

import java.util.Scanner;

public class e06MukemmelSayi {


/*  Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
                Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
        1+2+3 = 6 = 6 (Mükemmel)

                mukemmel sayi kontrolu
        1. kullanicidan sayi alalim
        2. bir toplam degiskeni olusturuyoruz
        3. sayinin bolenleri bul
        4. bolenleri toplamla topla
        5. sayiyla toplamin esitligini kontrol et
        */
public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    System.out.print("Lutfen hesaplanacak sayiyi giriniz:");
    int sayi = scanner.nextInt();

    if (mukemmelSayiHesapla(sayi)) {

        System.out.println(sayi + " mükemmel bir sayıdır.");
    } else {
        System.out.println(sayi + " mükemmel bir sayı değildir.");
    }

}

    public static boolean mukemmelSayiHesapla(int sayi) {

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;



    }
}










