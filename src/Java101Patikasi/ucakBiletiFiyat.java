package Java101Patikasi;
import java.util.Scanner;
public class ucakBiletiFiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int KM, yas, yTipi;
        double normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplamTutar;

        System.out.print("Mesafeyi km türünden giriniz :");
        KM = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yTipi = input.nextInt();

        if (KM > 0 && yas > 0) {
            if (yas <= 12 && yTipi == 1) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("Toplam tutar:" + indirimliTutar);
            } else if (yas <= 12 && yTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2.0;
                System.out.print("Toplam tutar:" + toplamTutar);
            } else if (yas > 12 && yas <= 24 && yTipi == 1) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("Toplam tutar:" + indirimliTutar);
            } else if (yas > 12 && yas <= 24 && yTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2.0;
                System.out.print("Toplam tutar:" + toplamTutar);
            } else if (yas > 65 && yTipi == 1) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.print("Toplam tutar:" + indirimliTutar);
            } else if (yas > 65 && yTipi == 2) {
                normalTutar = KM * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2.0;
                System.out.print("Toplam tutar:" + toplamTutar);
            } else if (yas > 24 && yas < 65 && yTipi == 1) {
                normalTutar = KM * 0.10;
                System.out.print("Toplam tutar:" + normalTutar);
            } else if (yas > 24 && yas < 65 && yTipi == 2) {
                normalTutar = KM * 0.10;
                toplamTutar = normalTutar * 2.0;
                System.out.print("Toplam tutar:" + toplamTutar);
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
    }

