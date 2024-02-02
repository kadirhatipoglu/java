import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;

        Scanner kg = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız: ");
        armut = kg.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız: ");
        elma = kg.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız: ");
        domates = kg.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız: ");
        muz = kg.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız: ");
        patlican = kg.nextDouble();

        Double tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);
        System.out.print("Ödemeniz Gereken Tutar: " + tutar + " TL");

        /**
         * @author Kadir Hatipoğlu
         */
    }
}