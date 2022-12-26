package Java101Patikasi;

import java.util.Scanner;

public class kullanicidanVeriAlma {

   public  static void main(String[] args ){
       // kullanıcıdan veri almak için scanner sınıfını projemize import etmemiz gerekiyor. (import java.util.Scanner;)
       // int a;
       Scanner input = new Scanner(System.in);
       // System.out.print("Bir sayı giriniz");
      // a = input.nextInt();  girdiğin veri türüne göre next... olarak değişir !
       //System.out.println(a);

       String adSoyad;

       adSoyad=input.nextLine();
       System.out.println("AdSoyad:" + adSoyad);
      int yas;
      yas=input.nextInt();
       System.out.println("Yaş:" + yas);

   }
}
