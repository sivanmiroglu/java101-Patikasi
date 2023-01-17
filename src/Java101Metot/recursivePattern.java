package Java101Metot;
import java.util.Scanner;
/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/
public class recursivePattern {
    public static void main(String[] args) {
        int number;

        Scanner scn = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        number = scn.nextInt();

        patternRecursive(number);

    }

    static void patternRecursive(int number, int count,boolean isContinue) {
        if(number<=0)
            isContinue=false;
        if(number>0 && isContinue ==true){
            System.out.print(number + " ");
            patternRecursive(number-5,++count,isContinue);
        }else{
            System.out.print(number + " ");
            if (count == 0)
                return;
            patternRecursive(number+5,--count,isContinue);
        }
    }
    static void patternRecursive ( int number){
        patternRecursive(number, 0,true);

    }

}
