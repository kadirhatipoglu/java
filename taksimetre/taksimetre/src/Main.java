import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double gidilenKm, ucret, kmBasi = 2.20, acilis = 10.0;

        Scanner x = new Scanner(System.in);

        System.out.print("Gittiğiniz Kilometre: ");
        gidilenKm = x.nextDouble();
        ucret = gidilenKm * kmBasi + acilis;

        ucret = (ucret < 20) ? 20 : ucret;
        System.out.print("Ücretiniz: " + ucret);

    }
}