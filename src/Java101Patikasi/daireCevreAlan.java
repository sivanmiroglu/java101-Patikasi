package Java101Patikasi;
import java.util.Scanner;
public class daireCevreAlan {
    public static void main(String[] args) {
       /* Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

         Formül : (𝜋 * (r*r) * 𝛼) / 360 */

        int r;
        double pi =3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz : ");
        r =inp.nextInt();
        double alan=pi * r * r;
        double cevre=2 * pi * r;

        System.out.println("Dairenin alanı :"+alan);
        System.out.println("Cevrenin alanı : "+cevre);
    }
}
