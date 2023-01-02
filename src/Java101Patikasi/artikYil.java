package Java101Patikasi;
import  java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        Scanner scan = new Scanner (System.in);

        System.out.print("Yıl giriniz: ");
        year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır!");
            }else {
                System.out.println(year + " bir artık yıl değildir!");
            }

        }else if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır!");
        }else {
            System.out.println(year + " bir artık yıl değildir!");
        }

    }
    }
