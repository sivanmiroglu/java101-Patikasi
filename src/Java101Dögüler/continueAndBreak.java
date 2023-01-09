package Java101Dögüler;

import java.util.Scanner;

public class continueAndBreak {
    public static void main(String[] args) {
        // i 10 defa dönücek ama değer 5 e geldiğinde break komutu sayesinde durucak ve sonrasını dönmicek.
        /*for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i dğeri 5 tir");
                break;
            }
            System.out.println(i);*/


        // 1 den 10 a kadar dönücek ama continue koyduğumuz nokta da dönmeyip ardından devam edicek.
        // yani 5 sayısını dönmeden göstermeden 6 dan dönmeye devam edicek.
        /*for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;

            }
            System.out.println(i);

        }*/

        // 1den 10 a kadar olan tek sayıları ekrana yazdırıcaz...
    // cuntinue ile çift sayıları ekrana yazdırmadık , sadece 1 den başlayıp ikişer şekilde tek sayıları yazdırdık.
        /*int i = 0;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
        /*int i=0;
        for(i=1; i<=6;i++)
        {
            if(i%3==0)
                continue;
            System.out.print(i+",");
        }*/

       /* for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }*/

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
    }

}
