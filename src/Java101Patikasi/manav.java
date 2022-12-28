package Java101Patikasi;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, toplam;
        int patlican = 5;

        Scanner oku = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        int armut1 = oku.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        int elma1 = oku.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        int domates1 = oku.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        int muz1 = oku.nextInt();

        System.out.print("Palıcan Kaç Kilo ? :");
        int patlican1 = oku.nextInt();

        toplam = (armut1*armut) + (elma1*elma) + (domates1*domates) + (muz1*muz) + (patlican1*patlican);
        System.out.print("Toplam Tutar : "+toplam);

    }
}
