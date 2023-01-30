public class carMain {
    public static void main(String[] args) {
        // car sınıfında oluşturduğum niteliklerden kullanabiliyorum eğer istemezsem aynı nitelikleri kullanarak kendşm bir değer atabiliyorum.
        Car fiat = new Car();
        fiat.model = "Egea";
        fiat.speed = 170;
        fiat.increaseSpeed(20); // Car sınıfında belirttiğim hızı arttır metodunu kullandım. aracım 130 hızındayken methodu kullanıp 20 arttırıyorum
        System.out.println(fiat.color); // rengini Car classında belirttiğim için burda vermedim.
        System.out.println(fiat.model);
        System.out.println(fiat.type);
        System.out.println("Hız : " + fiat.speed);
        System.out.println("---------------------");

       Car renault = new Car();
        renault.speed = 115;
        renault.decreaseSpeed(15); // car sınıfında ki hız azaltma methodunu kullandım ve hızımın girdiğim değer kadar düşmesini sağladım
        renault.model = "Symbol";
        renault.color = "Kırmızı"; // renginin beyaz olmasını istemedim ve ayrı bir renk olmasını istedim burda tekrar renk atadım
        System.out.println(renault.color);
        System.out.println(renault.model);
        System.out.println(renault.type);
        System.out.println(" Hız : " + renault.speed);
        System.out.println("---------------------");

        Car hyundai = new Car();
        hyundai.model = "i20";
        hyundai.color = "Lacivert";
        hyundai.increaseSpeed(25);
        System.out.println(hyundai.color);
        System.out.println(hyundai.model);
        System.out.println(hyundai.type);
        System.out.println("Hız : "+hyundai.speed); // car sınıfında tanımladığım hızı değiştirmedim ve ekrana orda ki hızı baz alarak yazdı.
    }
}
