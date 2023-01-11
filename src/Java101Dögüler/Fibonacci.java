package Java101Dögüler;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        /*Fibonacci Serisi Nedir ?
                Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
                Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
                 yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/

        int fibonacci, firstNumber = 0, secondNumber = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        fibonacci = input.nextInt();
        input.close();

        System.out.println(fibonacci < 0
                ? "Kural Hatası Oluştu. Fibanocci serisi pozitif tam sayılardan oluşur.\nLütfen girdiğiniz değeri kontrol ediniz."
                : fibonacci + " Elemanlı Fibonacci Serisi: ");

        for (int i = 0; i <= fibonacci; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
