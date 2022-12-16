package ders_04;

import java.util.Scanner;

public class KacGun {
    //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
    //INPUT:
    //Dakika sayısı: 3456789
    //OUTPUT :
    //3456789 dakika yaklaşık 6 yıl 210 gündür


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dakika girin");
        int dk = input.nextInt();

        gun(dk);

    }

    public static void gun(int d){
        int gun = 1440;
        int yil= 525600;

        if(d>yil){
            int yilsayisi=0;
            int gunsayisi=0;

            for(int i=d; i>yil; i=i-yil){
                yilsayisi++;
                int kalan= i-yil;
                if(kalan<yil){
                    gunsayisi=kalan/gun;
                }


            }

            System.out.println("yil : " +   yilsayisi + ", gunsayisi : " + gunsayisi);

        }else{
            System.out.println("gun sayisi : " +   d/gun);
        }


    }


}
