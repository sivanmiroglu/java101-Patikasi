package Java101Dögüler;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*int i = 1;
        int k;
        System.out.println("Program Başlangıcı :");
        while (i <= 5) {
            System.out.println(i);
            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Proram bitti");*/

        /*int left = 100; int right = 200;
        while(++left < --right);
        System.out.println("100 ile 200 ün ortası : " + left);*/

        // Kullanıcı Şifreyi Doğru girene kadar  program şifre istemeye devam edicek :
        Scanner input = new Scanner(System.in);
        int password;
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
             password = input.nextInt();

            if(password == 1907) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }else {
                System.out.println("Hesap şifreniz hatalı  ");
            }
        }
    }

}
