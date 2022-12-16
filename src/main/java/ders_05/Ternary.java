package ders_05;

import java.util.Scanner;

public class Ternary {
    //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
    //Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
    //Eger aynı karakterlere sahipse
    //"isim ayni karakterlere sahiptir." yazdirin.
    //Eger ayni kaakterlere sahip degilse
    //"Dizenin benzersiz karakterleri var" yazdirin.
    //Ternary kullanin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("uc harfli ad girin");
        String ad = input.next();

        String s = ad.length()==3 ?  ((ad.charAt(0)==ad.charAt(1)) || (ad.charAt(1)==ad.charAt(2)) || (ad.charAt(0)==ad.charAt(2))) ?
                "isim ayni karakterlere sahiptir" : "Dizenin benzersiz karakterleri var" : "ismin uzunlugu 3 olmalidir";
        System.out.println(s);

        //Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //INPUT   : Mustafa
        //OUTPUT  : fafafa

        String isim = "Mustafa";
        String isim1 = isim.substring(isim.length()-2).repeat(3);
        System.out.println(isim1);





    }
}
