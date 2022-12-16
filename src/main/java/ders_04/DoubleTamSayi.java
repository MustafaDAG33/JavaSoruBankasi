package ders_04;

import java.util.Scanner;

public class DoubleTamSayi {
    /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
     */

    public static void tam(double sayi){


        int t = (int)sayi;
        System.out.println(t);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("double sayi girin");
        double s = input.nextDouble();

        tam(s);
    }
}
