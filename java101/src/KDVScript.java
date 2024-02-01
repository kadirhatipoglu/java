import  java.util.Scanner;

public class KDVScript {
    public static  void  main(String[] args) {

        //Değikenleri Oluşturmak
        int ucret;

        //Scanner Tanımlamak
        Scanner deger = new Scanner(System.in);

        //Kullanıcıdan Ücret Almak
        System.out.print("Ücretiniz: ");
        ucret = deger.nextInt();

        //Kdv' siz fiyat yazdırma
        System.out.println("KDV'siz Fiyatınız: " + ucret);

        //KDV' li fiyat yazdırma
        double kdv1 = ucret * 18.0 ;
        double kdv2 = kdv1 / 100.0 ;
        double kdv = kdv2 + ucret ;
        System.out.println("KDV'li Fiyatınız: " + kdv);

        //KDV Tutarını yazdırma
        System.out.println("KDV Tutarınız: " + kdv2);

        /**
         * @author Kadir Hatipoğlu
         */
    }
}