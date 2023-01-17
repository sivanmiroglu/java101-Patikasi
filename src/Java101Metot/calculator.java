package Java101Metot;

import java.util.Scanner;

/*1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı*/
public class calculator {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Kalan : " + result);
        return result;
    }

    static int impact(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }

    static int divide(int a, int b) {

        if (b == 0) {
            System.out.println("İkinci Sayı 0 dan farklı olmalı ");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Faktöryel : " + result);
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + 2 * (a + b));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk Sayıyı Giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayıyı Giriniz :");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    impact(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;

                case 5:
                    System.out.println("Üs Hesabı " + power(a, b));

                case 6:
                    factorial();
                    break;

                case 7:
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;

                case 8:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz ...");
            }
        }
        System.out.println("GÜLE GÜLE ...");
    }
}
