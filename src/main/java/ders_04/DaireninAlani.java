package ders_04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DaireninAlani {

    /*
        Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

r=7;

Pi=3.14

Ipucu:

Dairenin Cevresi : 2*Pi*r

Dairenin Alani : Pi*r*r

Ornek Cikti:

43.96

153.86
     */
    double pi = 3.14;

    public void alan(int r){


        NumberFormat f = new DecimalFormat(".##");
        double d = pi*r*r;
        System.out.println(f.format(d));

    }
    public static double cevre(int r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        DaireninAlani alan = new DaireninAlani();
        alan.alan(3);

        System.out.println(cevre(6));


    }




}
