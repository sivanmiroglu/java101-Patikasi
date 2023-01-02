package Java101Patikasi;

import java.util.Scanner;

/*Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
public class sinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        Scanner value = new Scanner(System.in);

        System.out.println("ÖZEL FİTNAT KOLEJİNE HOŞ GELDİNİZ ...");
        System.out.println("SINIFTA KALMAMAK İÇİN NOT ORTALAMANIZ 55 ÜSTÜ OLMALIDIR !");

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        if ((mat <= 0) || (mat > 100)) {
            System.out.println("Geçerli bir not giriniz , Girdiğiniz değer 1 ie 100 arasında olmalıdır");
            System.out.print("Notunuzu tekrar girmek ister misiniz ? (evet veya hayır):");
            String cevap = value.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni Notunuzu giriniz: ");
                mat = input.nextInt();
            }
        }


        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if ((fizik <= 0) || (fizik > 100)) {
            System.out.println("Geçerli bir not giriniz , Girdiğiniz değer 1 ie 100 arasında olmalıdır");
            System.out.print("Notunuzu tekrar girmek ister misiniz ? (evet veya hayır):");
            String cevap = value.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni Notunuzu giriniz: ");
                fizik = input.nextInt();
            }

        }


        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if ((turkce <= 0) || (turkce > 100)) {
            System.out.println("Geçerli bir not giriniz , Girdiğiniz değer 1 ie 100 arasında olmalıdır");
            System.out.print("Notunuzu tekrar girmek ister misiniz ? (evet veya hayır):");
            String cevap = value.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni Notunuzu giriniz: ");
                turkce = input.nextInt();
            }
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if ((kimya <= 0) || (kimya > 100)) {
            System.out.println("Geçerli bir not giriniz , Girdiğiniz değer 1 ie 100 arasında olmalıdır");
            System.out.print("Notunuzu tekrar girmek ister misiniz ? (evet veya hayır):");
            String cevap = value.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni Notunuzu giriniz: ");
                kimya = input.nextInt();
            }
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if ((muzik <= 0) || (muzik > 100)) {
            System.out.println("Geçerli bir not giriniz , Girdiğiniz değer 1 ie 100 arasında olmalıdır");
            System.out.print("Notunuzu tekrar girmek ister misiniz ? (evet veya hayır):");
            String cevap = value.nextLine();
            if (cevap.equals("evet")) {
                System.out.print("Yeni Notunuzu giriniz: ");
                muzik = input.nextInt();
            }
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        if (average <= 55) {
            System.out.println(" Maalesef Sınıfta Kaldınız ");

        } else {
            System.out.println(" EVREKAAAA Sınıfı Geçtiniz ");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
