package ders_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MulakatSorusu {
    public static void main(String[] args) {

        //Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        //Input  :1238
        //Output :Girilen Numananin Tersi: 8321

        int s = 1238;
        String str = String.valueOf(s);
        System.out.println(str);

        //1.yol
        StringBuilder sb = new StringBuilder(str);
        System.out.println("tersi : " +  sb.reverse());

        //2.yol
        String sum="";
        for(int i=str.length()-1; i>-1; i-- ){
            char c= str.charAt(i);
            sum+=c;
        }
        System.out.println("tersi : " +  sum);

        //3.yol
        String arr[] = str.split("");
        String ters = "";
        for(String w : arr){
           ters=w + ters;
        }
        System.out.println("tersi = " + ters);

        //1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        //OutPut:
        //Sayilarin Toplami : 5050
        int toplam=0;
        for(int k = 1; k<101; k++){
            toplam+=k;
        }
        System.out.println("toplam = " + toplam);


    }

   
    
}
