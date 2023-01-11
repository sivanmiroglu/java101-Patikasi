package Java101Dögüler;
import java.util.Scanner;
public class odev4 {
    public static void main(String[] args) {
        /*Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak
    adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)*/

        // n! = 1 * 2 * 3 * 4 * ... * n
        Scanner input = new Scanner(System.in);
        int total = 1, total2 = 1, total3 = 1, r, z;
        int combination;
        System.out.print("Faktöriyel Sayısını(n) Giriniz : ");
        int n = input.nextInt();
        System.out.print("r sayısını giriniz : ");
        r = input.nextInt();

        z = n - r;
        System.out.println("z = n-r");

        //Faktöriyel Hesaplama
        for (int i = 1; i <= n ; i++){
            total *=i;
        }
        System.out.println("(n) " + n+"! = " + total);

        //Kombinasyon Hesaplama

        for (int j = 1 ; j <= r ; j++){
            total2 *= j;
        }
        System.out.println("(r) " + r+"! = " + total2);

        for (int p =1 ; p <= z ; p++){
            total3 *= p;
        }
        System.out.println("(z) " + z+"! = " + total3);

        System.out.println("Kombinasyon Formülü : C(n,r) = n! / (r! * (n-r)!) ");

        combination = total / (total2 * total3);
        System.out.println("Kombinasyon --> (C(" + n +","+ r + ")) : " + combination);

    }

    }

