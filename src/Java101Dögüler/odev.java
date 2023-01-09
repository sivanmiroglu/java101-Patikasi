package Java101Dögüler;

import java.util.Scanner;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class odev {
    public static void main(String[] args) {
        int c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        c = inp.nextInt();

        for (int i = 1; i <= c; i++) {
            if (i % 3 == 0 || i % 4 == 0 ) {
                System.out.println(i);

            }
        }
    }
}

