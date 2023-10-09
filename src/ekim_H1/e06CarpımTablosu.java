package ekim_H1;

public class e06CarpımTablosu {
    public static void main(String[] args) {
        /*
        2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

        Örnek Ekran çıktısı
        1  2  3  4  5
        2  4  6  8 10
        3  6  9 12 15
        4  8 12 16 20
        5 10 15 20 25
        */
        int boyut = 5;

        // Çarpım tablosunu hesaplayıp yazdır

        for (int satir = 1; satir <= boyut; satir++) {

            for (int sutun = 1; sutun <= boyut; sutun++) {

                // Çarpım sonucunu hesapla

                int carpim = satir * sutun;

                // Sonucu ekrana yazdır ve tab ile ayır
                System.out.print(carpim + "\t");
            }
            // Bir satırın sonunda yeni bir satıra geç
            System.out.println();
        }
    }
}

