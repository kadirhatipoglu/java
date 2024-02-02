import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;

        Scanner deger = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (Metre Cinsinde) Giriniz: ");
        boy = deger.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = deger.nextInt();

        double indeks = kilo / (boy * boy) ;
        System.out.print("Vücut Kitle İndeksiniz: " + indeks);

    }
}