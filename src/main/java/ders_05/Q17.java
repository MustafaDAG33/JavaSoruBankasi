package ders_05;

import java.util.Scanner;

public class Q17 {
    //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
    //INPUT:
    //Dakika sayısı: 3456789
    //OUTPUT :
    //3456789 dakika yaklaşık 6 yıl 210 gündür

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("dakika girin");
        int d = input.nextInt();

        int gun = 1440;
        int yil= 525600;

        int yilSayisi = d/yil;
        int gunSayisi = d%yil/gun;

        System.out.println("yilSayisi = " + yilSayisi + " gun sayisi : " +  gunSayisi);
        System.out.println("gunSayisi = " + gunSayisi);

    }



}
