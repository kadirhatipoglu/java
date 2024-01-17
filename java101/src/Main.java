import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri Oluşturmak
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner Sınıfını Tanımlamak
        Scanner cikti = new Scanner(System.in);

        //Kullanıcıdan Değerleri Almak
        System.out.print("Matematik Notunuz : ");
        mat = cikti.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = cikti.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = cikti.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = cikti.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = cikti.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = cikti.nextInt();

        // Ortalamayı Hesaplayıp 60 Üstü Olup Olmadığını Kontrol Etmek
        // Eğer 60 ve üstü Bir Sayıysa "Geçti" Çıktısı, Aksi Halde "Kaldı" Çıktısı Vermek.
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        boolean sonuc1 = (sonuc >= 60.0);
        String gecmeKalma = sonuc1 ? " Geçti" : " Kaldı";
        System.out.println("Ortalamanız : " + sonuc + gecmeKalma);

        /**
         * @author Kadir Hatipoğlu
         */

    }
}

