package ders_04;

import java.util.Scanner;

public class ScannerBasamakToplami {
    //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
    //   Örnek Çıktı:
    //   Verilen tamsayının rakamları toplamı 10'dur.

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("uc basamakli bir sayi giriniz");
//        int sayi = input.nextInt();

//        int sum=0;
//        for(int i=sayi; i>0; i=i/10){
//            sum+=i%10;
//        }
//        System.out.println(sum);

        basToplami(125);






    }
    public static void basToplami(int s){
        int sum=0;
        for(int i=s; i>0; i=i/10){
            sum+=i%10;
        }
        System.out.println(sum);
    }

}
