package Java101Patikasi;

public class main {
    public static void main(String[] args) {
        /**
         * @outhor Şivan Miroğlu 20222
         */
        System.out.println("Java101 Patikası !");

        // Java da değişken tanımlama ilk ders.
        // dikdörtgen alan hesaplama örneği :

        int kisakenar = 25, uzunkenar = 34;
        int alan = kisakenar * uzunkenar;
        int cevre = 2 * (kisakenar+uzunkenar);

        System.out.println(alan);
        System.out.println(cevre);

        // Java da tam sayı belirten veri tipleri :

        byte a=120;
        short b= 1200;
        int c=100000;
        long d=1000000;

        // Float ve Double veri tipleri

        float numberone=1.43f;
        // float değere ondalıklı sayı tanımlamak için "f" ile birlikte yazılır.
        // float veri tipine tam sayı atasanız bile ondalıklı sayı olarak algılar.
        System.out.println(numberone);

        double numbertrue=4.44;
        System.out.println(numbertrue);

        float t,x;
        t = 35 + 5;
        x= t / 4;
        System.out.println(x);

        // char ve boolean
        char letter ='c';
        boolean logic1=true;
        boolean logic2=false;

        // String Sınıfı
        // string charlardan oluşan veri tiplerinin kümesi. yani karakterler topluluğu diyebiliriz.
        String words = "Java101 Patikasi";
        System.out.println(words);

        int m = -12;
        int n = -5;
        int cevap = m%n;
        System.out.println(cevap);

}
}
