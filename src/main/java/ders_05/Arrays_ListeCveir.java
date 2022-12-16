package ders_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_ListeCveir {
    public static void main(String[] args) {

        //Array i ARRAYLIST e çeviren Java Kodunu yazınız.
        //Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
        //Beklenen Çıktı:
        //[Python, JAVA, PHP, Perl, C#, C++]


        String arr[] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        //Array: [1232,2345,5467,678,3454,2312,3451]

        int brr[] = {1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(brr);
        System.out.println(brr[brr.length-2]);


        //Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        //Array: [1,2,3,4,5,6,7,8,9]
        //Beklenen Çıktı:
        //Tek Sayilar: 5
        //Cift Sayilar: 4

        int crr[] = {1,2,3,4,5,6,7,8,9};

        int tekSayilar = 0;
        int ciftSayilar = 0;

        for(int w : crr){
            if(w%2==0){
                ciftSayilar++;
            }else{
                tekSayilar++;
            }
        }
        System.out.println("ciftSayilar = " + ciftSayilar);
        System.out.println("tekSayilar = " + tekSayilar);


        //Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        //Test Data:
        //sentence -> "Java is fun"
        //reversed **-> "**fun is Java**"**

        String str = "Java is fun";
        String str1[] = str.split(" ");

        String ters = "";

        for(String w : str1){
            ters= w + " "  + ters;
        }
        System.out.println(ters);

        //Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

        int a=112, b=22, c=45;
        int buyuk = Math.max(a,b);
        int enBuyuk = Math.max(buyuk,c);
        System.out.println("enBuyuk = " + enBuyuk);

        //1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

        int gun = 1;

        switch(gun){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default :
                System.out.println("gecersiz !! ..");
        }

       carp(7);
        arti();





    }

    public static void carp(int a){

        for(int i=1; i<11; i++){
            System.out.println(i + "*"+ a + "="+ i*a);
        }
    }
    //1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
    public static void arti(){

        for(int i=1; i<11; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
