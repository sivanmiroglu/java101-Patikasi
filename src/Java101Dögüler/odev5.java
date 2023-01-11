package Java101Dögüler;
import java.util.Scanner;
public class odev5 {
    public static void main(String[] args) {
        /*Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız*/

        Scanner sc = new Scanner(System.in);
        int a, b;
        int c= 1;

        System.out.print("Lütfen sayınızı giriniz: ");
        a = sc.nextInt();

        System.out.print("Lütfen  sayı üssünü giriniz: ");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            c*=a;

        }
        System.out.println("Sonuç: "+c);
    }
    }

