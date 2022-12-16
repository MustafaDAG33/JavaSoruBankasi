package ders_06;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collections04 {
    public static void main(String[] args) {

        //Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
        //TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

        TreeSet<String> color = new TreeSet<>();
        color.add("sari");
        color.add("mavi");
        color.add("yesil");
        color.add("turuncu");
        color.add("kirmizi");
        color.add("pembe");

        System.out.println(color);//[kirmizi, mavi, pembe, sari, turuncu, yesil]

        System.out.println(color.first());
        System.out.println(color.last());

       //Example 16: Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
        //TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        TreeSet<String> color1 = new TreeSet<>();
        color1.add("sari");
        color1.add("mavi");
        color1.add("yesil");
        color1.add("turuncu");
        color1.add("kirmizi");
        color1.add("pembe");
        System.out.println(color1);
        System.out.println(color1.size());


        //Example 17 : Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
        //1. TreeSet: mavi,yesil,kirmizi,sari
        //2. TreeSet: yesil,mavi,pembe,turuncu
        //Beklenen Çıktı:
        //1. TreeSet: [kirmizi,mavi,sari,yesil]
        //2. TreeSet: [mavi,pembe,turuncu,yesil
        //Karsilastirma Sonucu:
        //no
        //yes
        //no
        //yes
        TreeSet<String> t = new TreeSet<>();
        t.add("mavi");
        t.add("yesil");
        t.add("kirmizi");
        t.add("sari");
        TreeSet<String> tr = new TreeSet<>();
        tr.add("mavi");
        tr.add("pembe");
        tr.add("turuncu");
        tr.add("yesil");

        for(String w : t){
            if(tr.contains(w)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }



        //Example 18 : Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
        //priority queue elemanları: sari,yesil,mavi,kirmizi
        //Beklenen Çıktı:
        //Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]

        PriorityQueue<String> p = new PriorityQueue<>();
        p.add("sari");
        p.add("yesil");
        p.add("mavi");
        p.add("kirmizi");
        System.out.println(p);


    }
}
