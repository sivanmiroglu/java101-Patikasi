package Java101Dögüler;
/*
Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.
*/
import java.util.Scanner;
public class odev2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        int number;
        do{
            System.out.print("Sayi Giriniz: ");
            number=input.nextInt();
            if(number%4==0){
                result+=number;
            }
        }
        while(number%2==0);
        System.out.println("4'e bölünebilen sayilarin toplami= " + result );
    }
}
