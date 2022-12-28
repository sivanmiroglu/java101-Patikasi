package Java101Patikasi;
import java.util.Scanner;
public class kitleEndeksi {
    public static void main(String[] args) {

        /*Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
         "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
         
        Formül
        Kilo (kg) / Boy(m) * Boy(m)*/

        double boy,kilo,index;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        index =kilo/(boy+boy);
        System.out.println("Vücut Kitle İndexinix : " + index);
    }
}

