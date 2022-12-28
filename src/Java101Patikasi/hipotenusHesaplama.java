package Java101Patikasi;
import java.util.Scanner;
public class hipotenusHesaplama {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        //Formül
       // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //    𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        int a,b;
        double c;

        Scanner girdi=new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b =girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b) ); // Math.sqrt java  sayının karekökünü almamamızı sasğlıyor.
        System.out.println("Hipotenüs : " + c);
    }
}
