package Java101Patikasi;
import java.util.Scanner;
public class manav {
    public static void main(String[] args) {

        /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
        göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

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
