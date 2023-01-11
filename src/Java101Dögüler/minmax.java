package Java101Dögüler;
import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        /*Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22*/

        Scanner scan = new Scanner(System.in);

        int calc, number = 0, i=1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.print("How many number enter you will : ");
        calc = scan.nextInt();

        do {
            System.out.print(i + " .Number : ");
            number = scan.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            i++;
        } while (calc >= i);

        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }
}
