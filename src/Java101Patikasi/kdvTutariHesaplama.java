package Java101Patikasi;
import java.util.Scanner;
public class kdvTutariHesaplama {
    public static void main(String[] args) {

        //KDV'siz Fiyat = 10;

        //KDV'li Fiyat = 11.8;

        //KDV tutarı = 1.8;

        // Ödev
        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        //  tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double tutar, kdvOran = 0.18,kdvTutar,kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyatı Giriniz : ");
        tutar =inp.nextDouble();
         kdvTutar =tutar * kdvOran;
         kdvliTutar = tutar + kdvTutar;

         
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV ' li Tutarı : " + kdvliTutar);
    }
}
