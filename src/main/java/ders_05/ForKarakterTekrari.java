package ders_05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForKarakterTekrari {
    //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
    //    char ch1= 'a' ;
    //		String name =“John came late"
    //		Expected Output:
    //    Number of a = 2

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir isim girin");
        String isim = input.next();
        System.out.println("bir karakter girin");
        String k = input.next().substring(0,1);
        int kTekrarSayisi=0;
        for(int i=0; i<isim.length(); i++){

            String a = isim.substring(i, i+1);

            if(a.equalsIgnoreCase(k)){
                kTekrarSayisi++;
            }
        }
        if(kTekrarSayisi==0){
            System.out.println("verilen karakter kullanilmamis");
        }

        System.out.println(k + "'nin karakter sayisi : "   + kTekrarSayisi);

        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //Input :
        //String str=“Javaisalsoeasy”
        //Output: a s

        String str = "Javaisalsoeasyj";

        String sum = "";

        for(int i=0; i<str.length(); i++){

            String r = str.substring(i, i+1);

            if(str.indexOf(r)!= str.lastIndexOf(r)){
                if(!sum.contains(r)){
                    sum= sum + r;
                }

            }
        }
        System.out.println(sum);







    }
}
