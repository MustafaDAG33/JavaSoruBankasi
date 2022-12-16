package ders_04;

public class Dikdortgen {
    /*
        Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

A=5

B=3

Ipucu:
Dikdortgenin Cevresi : 2*(A+B);

Dikdortgenin Alani : A * B ;

Ornek Cikti:

Dikdortgenin Cevresi : 16

Dikdortgenin Alani : 15
     */

    public void dikdortgeninAlani(int a, int b){
        System.out.println(a*b);
    }

    public void dikdortgeninCevresi(int a, int b){
        System.out.println(2*(a+b));
    }

    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.dikdortgeninAlani(5,5);
        dikdortgen.dikdortgeninCevresi(7,3);
    }












}
