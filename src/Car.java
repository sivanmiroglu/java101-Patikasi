class Car {
    // Nitelikler
    String type = "sedan";
    String model = "TEST";
    String color = "Beyaz";
    int speed =100;
    int speedLimit = 180;
    // arabayı modelledik , hızını artırmasını azaltmasını belirledik ve bu sınıfa istediğinmiz kadar nesne üretebiliriz.

    // Hız arttırma işlemi aslında bir modelleme yapıyoruz increase = artırma increment = artış artılıcak değer
    void increaseSpeed(int increment) {  // hız artımı istendi mi bu method çağrılmış olucak , // davranış verdik increment e verdiğimiz değeri alıp hızı artırıcak
        // hızımız 180 den küçükse artırma işlemi uygula.
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    // decrease = azaltmak
    // eğer hızımız 0 dan büyükse azaltma methodunu çalıştır
    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    // Ekrana aracın hızını gösteren method
    void printSpeed(){
        System.out.println("Hızınız : "+ speed);
    }
}
