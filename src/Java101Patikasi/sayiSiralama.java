package Java101Patikasi;
import java.util.Scanner;
public class sayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.println("1.sayıyı Giriniz : ");
        a = inp.nextInt();

        System.out.println("2.sayıyı Giriniz : ");
        b = inp.nextInt();

        System.out.println("3.sayıyı Giriniz : ");
        c = inp.nextInt();


        if((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }
            else{
                System.out.println("a<c<b");
            }
        }else if ((b<a) && (b<c))
        {
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }
    }
}
