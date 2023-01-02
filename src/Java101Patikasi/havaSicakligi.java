package Java101Patikasi;
import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {
        int heat;

        // Faklı kullanıcıdan veri alınabilecek yapıyı oluşturduk.

        Scanner inp = new Scanner(System.in);
        System.out.println("Sicaklık Giriniz : ");
        heat = inp.nextInt();


        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if(heat>5 && heat<15){
            System.out.println("Sinemaya Gdiebilirsiniz");

        }
        else if(heat>15 && heat <25 ){
            System.out.println("Piknik yapabilirsiniz.");

        }
        else{
            System.out.println("Yüzme eklinliğini yapabilirsiniz");
        }


    }
}
