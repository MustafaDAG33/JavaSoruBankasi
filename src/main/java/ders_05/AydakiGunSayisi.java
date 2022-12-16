package ders_05;

public class AydakiGunSayisi {
    //Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
    //INPUT:
    //Ay Numarasi:
    //2
    //Yil :
    //2016
    //OUTPUT  :
    //Subat 2016 29 Gundur.
    public static void main(String[] args) {

        int ay=2;
        int yil = 2023;



        switch(ay){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Ay 31 gundur");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Ay 30 gundur");
                break;
            case 2 :
                if((yil%4==0 && yil%100!=0) || yil%400==0){
                    System.out.println("Ay 29 gundur");
                }else{
                    System.out.println("Ay 28 gundur");
                }
                break;
            default :
                System.out.println("Gecersiz islem");

        }






    }
}
