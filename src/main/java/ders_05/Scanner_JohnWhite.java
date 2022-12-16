package ders_05;

import java.util.Scanner;

public class Scanner_JohnWhite {

    //Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
    //Input :
    //John White
    //1234234534561478
    //Output : Name :
    //J*** W****
    //CCN  : **** **** **** 1478
    //* Ilk Harfler Buyuk harf ile baslamalidir.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String ad = input.nextLine();
        System.out.println("16 haneli kart no giriniz");
        String kart = input.next();

        String ad1 = ad.split(" ")[0].substring(0,1).toUpperCase() + ad.substring(1, ad.indexOf(" ")).replaceAll("\\S", "*")+ " "+
       ad.split(" ")[1].substring(0,1).toUpperCase() + ad.substring(ad.indexOf(ad.split(" ")[1].substring(1))).replaceAll("\\S", "*");



        String k = kart.substring(0,4).replaceAll("[0-9]", "*")+ " " +  kart.substring(4,8).replaceAll("[0-9]", "*")+" "+
                kart.substring(8,12).replaceAll("[0-9]", "*") + " " +  kart.substring(12,16);

        System.out.println("Name : " +  ad1);
        System.out.println("Kart No : "  + k);


    }
}
