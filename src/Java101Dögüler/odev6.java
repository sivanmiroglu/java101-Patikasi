package Java101Dögüler;
import java.util.Scanner;
public class odev6 {
    public static void main(String[] args) {
       /* Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        Örnek : 1643 = 1 + 6 + 4 + 3 = 14*/

        Scanner input = new Scanner(System.in);
        int a,toplam=0;

        System.out.print("Bir Sayi Giriniz: ");
        a = input.nextInt();
        while (a != 0){
            toplam += (a % 10);
            a/=10;

        }
        System.out.println("Sayilarin toplamı: "+ toplam);
    }
    }

