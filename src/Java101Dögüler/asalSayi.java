package Java101Dögüler;
import java.util.Scanner;
public class asalSayi {
    public static void main(String[] args) {
        /*Senaryo
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97*/

        for (int i = 2; i <= 100; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }
            if (isAsal)
                System.out.print(i + ", ");
        }
    }
}
