package Java101Dögüler;

import java.util.Scanner;

public class mainFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* for (int i = 0; i < =7; i++) {
            System.out.println("Şivan Miroğlu");
        }*/
        /*for (int sayac = 1; sayac <= 10; sayac++) {
            System.out.println(sayac);
        }*/

        // kullanıcı 0 dan küçük değer girdiğinde programımız çalışmayacak !
        int sayi;

        /* for(boolean run = true; run;){
            System.out.print("Sayi Giriniz : ");
            sayi = input.nextInt();
            if(sayi<0){
                run = false;
            }
            } */

        // while

       /* System.out.print("Sayi Giriniz : ");
        sayi = input.nextInt();
        while(sayi>0){
            System.out.print("Sayi Giriniz : ");
            sayi = input.nextInt();
        }*/
        // do while
            do{
                System.out.print("Sayi Giriniz : ");
                sayi = input.nextInt();
            }while(sayi>0);
       }

    }

