package Java101Metot;

public class mainLocalvariable {
    /*static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int y = 3;
        int z = 2;
        if (y != z) {
            int x = 20;
        }
        int x = 50;
        number(x, z);
    }*/

    /*public static void main(String args[]) {
        String x = "Patika.dev";
        kodluyoruz(x);
        System.out.println(x);
    }
    static void kodluyoruz(String y)
    {
        String x = "Java101";
        y = "Kodluyoruz";
    }*/



    /*Bu örnekte if blokları arasında tanımlanmış olan integer türünde ki "b" değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde hata ile karşılaşılacaktır.
    Çünkü "b" değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.*/


    /*Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde tanımlanmış olan "a" değişkeni if bloğu içerisinde kullanılabilir, çünkü if bloğu main metodun bir parçasıdır. Ama "a" değişkeni ekranaBas();
    metodu içerisinde kullanılamaz, bunun sebebi ise ekranaBas() ve main metodu farklı iki kod bloklarıdır.*/

    /*static void ekranaBas(){
        // Hatalı kullanım
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        if (a < 10) {
            int b = 20;
            System.out.println(a);
        }
        // Hatalı kullanım
        System.out.println(b);
    }*/
}
