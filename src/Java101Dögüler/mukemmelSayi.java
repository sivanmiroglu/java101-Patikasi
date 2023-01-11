package Java101Dögüler;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        /*Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        kendisine eşit olan sayıya mükemmel sayı denir.

        Senaryolar
        Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        Bir sayı giriniz: 496
       496 Mükemmel sayıdır*/


        //6  -> 1,2,3
        //28 ->1,2,4,7,14

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int total = 0;

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=1; i<number; i++){
            if (number % i ==0){
                total += i;
            }
        }
        if (number == total){
            System.out.println(number +" Mükemmel sayıdır.");
        } else{
            System.out.println(number+ " Mükemmel sayı değildir.");
        }
    }
}
