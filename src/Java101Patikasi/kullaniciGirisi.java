package Java101Patikasi;

import java.util.Scanner;
     /*Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,eğer kullanıcı sıfırlamak
        isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
        şifre ile aynı olmaması gerektiğini kontrol edip,şifreler aynı ise ekrana"Şifre oluşturulamadı,
        lütfen başka şifre giriniz."
        sorun yoksa"Şifre oluşturuldu"yazan programı yazınız.*/

public class kullaniciGirisi {
    public static void main(String[] args) {

        String username, password, newpassword;

        Scanner value = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        username = value.nextLine();

        System.out.print("Şifreniz : ");
        password = value.nextLine();

        //equals (), String sınıfında, iki dizeyi karşılaştırmak ve eşit olup olmadıklarını belirlemek için kullanılan bir yöntemdir.
        if (username.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı ");
        } else {
            System.out.println("Bilgilerinizi Kontrol Ediniz !!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

            String cevap = value.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                newpassword = value.nextLine();

                if (newpassword.equals("java101")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    System.out.print("Yeni şifreniz:" + newpassword);
                }
            }
        }
    }
}

