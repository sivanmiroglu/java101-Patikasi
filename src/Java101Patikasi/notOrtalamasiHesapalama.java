package Java101Patikasi;
import java.util.Scanner;
public class notOrtalamasiHesapalama {
    public static void main(String[] args) {
        //Not Ortalaması Hesaplayan Program
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
        // alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //Ödev
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
        // ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        //Not : If ve Else kullanılmayacak...

        // Değişkenleri Oluşturuyoruz ...
        int mat,turkce,fizik,kimya,tarih,muzik;

        // Scanner Sınıfını tanımlıyoruz ...
        Scanner inp=new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz ...

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + turkce + tarih + kimya + fizik + muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortlamanız : " + sonuc);
    }
}
