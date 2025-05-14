// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Program giriş cümlesi
        System.out.println("Manav Kasa Programı");

        // Değişkenler
        int islem, alinanMeyve;

        double tutar = 0, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, kg = 0;
        
        // Programı döngüye sokuyoruz
        do {
            // işlem değişkeninin alabileceği değerler
            System.out.println("----------------------------");
            System.out.println("1. Meyve Al");
            System.out.println("2. Toplam Ücret Kontrolü");
            System.out.println("3. Ücreti Öde ve Programdan Çık");
            System.out.println("----------------------------");

            // Kullanıcıdan işlem bilgisi alma
            System.out.print("İşleminizi Seçin: ");
            islem = degerAl.nextInt();

            // işlem bilgisine göre yapılacak işlemleri
            switch (islem) {
                case 1:
                    // 1. Meyve Al : işlemi için yapılan işlemleri
                    // alinanMeyve değişkeninin alabileceği değerler 
                    System.out.println("----------------------------");
                    System.out.println("Meyve Ücretleri");
                    System.out.println("----------------------------");
                    System.out.println("1. Armut = " + armut + " TL");
                    System.out.println("2. Elma = " + elma + " TL");
                    System.out.println("3. Domates = " + domates + " TL");
                    System.out.println("4. Muz = " + muz + " TL");
                    System.out.println("5. Patlıcan = " + patlican + " TL");
                    System.out.println("6.Meyve Alımından Çık");
                    
                    do {
                        // Kullanıcıdan alinanMeyve bilgisini alma
                        System.out.print("Alacağınız meyve: ");
                        alinanMeyve = degerAl.nextInt();

                        // Kg bilgisini meyve almayacak ise kullanıcı karşısına çıkarmamak için if yapısı
                        if (alinanMeyve != 6) {
                            // Kullanıcıdan kaç kilo alacağı bilgisini alma
                            System.out.print("Kaç kilo alıcaksınız: ");
                            kg = degerAl.nextDouble();
                        }
                        
                        // alinanMeyve bilgisine ödenecek ücret bilgisini toplama
                        switch (alinanMeyve) {
                            case 1:
                                tutar += armut * kg;
                                break;
                            case 2:
                                tutar += elma * kg;
                                break;
                            case 3:
                                tutar += domates * kg;
                                break;
                            case 4:
                                tutar += muz * kg;
                                break;
                            case 5:
                                tutar += patlican * kg;
                                break;
                            default:
                                break;
                        }

                    } while (alinanMeyve != 6);

                    break;
                case 2:
                    // 2. Toplam Ücret Kontrolü : işlemi için yapılan işlemleri
                    System.out.println("Toplam ödeyeceğiniz ücret: " + tutar + " TL");
                    break;
                default:
                    break;
            }

        } while (islem != 3);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
