package Java101Patikasi;
import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        int dogumYili,islem;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Doğum Yılınızı Giriniz: ");
        dogumYili = inp.nextInt();

        islem = dogumYili%12;
        if (islem == 0){
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        } else if (islem == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (islem == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (islem == 3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (islem == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (islem == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (islem == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (islem == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (islem == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (islem == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (islem == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (islem == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }else {
            System.out.println("Hata.");
        }
    }
    }
