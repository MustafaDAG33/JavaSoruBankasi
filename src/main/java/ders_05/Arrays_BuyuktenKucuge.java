package ders_05;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Arrays_BuyuktenKucuge {

    /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        not: Test datadaki değerleri kullanınız.
        Test Data:
        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]
        Beklenen Çıktı:
        [1022,1134,1232,2345]
        [C Programming, C#, C++, Java, PHP, Python]
     */
    public static void main(String[] args) {

        int arr[] = {1232, 1134,2345,1022};
        String brr[] = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

        //2.soru
        //Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        //Array =  [20, 30, 25, 35, -16, 60, -100 ]
        //Beklenen Çıktı:
        //Array Sayılarının ortalaması: 7.0

        int a[] = {20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for(int w : a){
            sum+=w;
        }
        System.out.println(sum/a.length);

        //Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
        //Beklenen Çıktı:

        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0

        for(int i=1; i<11; i++){
            for(int j=1; j<11; j++){
                System.out.print("0  ");
            }
            System.out.println();

        }
        //yazılan değerin array içerisinde arayan Java Kodu yazınız.
        //Array: [1551,1223,1443,1267,1789,1023,2020]
        //Aranan Değer:2020
        //Beklenen Çıktı:**True**
        //Aranan Değer:2010
        //Beklenen Çıktı :**False**

        int str[] = {1551,1223,1443,1267,1789,1023,2020};


        for(int w : str){
            if(w==2020){
                System.out.println("true");
            }
        }

        //Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //Array: [12,15,43,23,56,76,78,90,77,43]
        //Aranan değer:56
        //Beklenen Çıktı:
        //56 sayısı arrayin 4. elemanı

        int st[] = {12,15,43,23,56,76,78,90,77,43};


        int wantedNumber = 56;
        int idx = Arrays.binarySearch(st,wantedNumber);
        System.out.println(wantedNumber + " sayisi arrayin " + idx + ". elemanı");

    }
}
