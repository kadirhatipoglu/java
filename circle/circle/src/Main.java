import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi Tanımlıyoruz
        double pi = 3.14;
        int r;

        //Scanner Tanımlıyoruz
        Scanner yaricap = new Scanner(System.in);

        //Kullanıcıdan Yarı Çapı Alıyoruz
        System.out.print("Dairenizin Yarı Çapını Giriniz: ");
        r = yaricap.nextInt();

        //Alanı Ve Çevreyi Hesaplatıp Ekrana Yazdırıyoruz
        double alan = pi * r * r;
        System.out.println("Dairenizin Alanı: " + alan);

        double cevre = 2 * pi * r;
        System.out.print("Dairenizin Çevresi: " + cevre);

        /**
        * @author Kadir Hatipoğlu
         */
    }
}