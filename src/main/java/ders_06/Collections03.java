package ders_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collections03 {
    public static void main(String[] args) {

        /*
                    TreeSet tekrarsiz elemanlari "alfabetik sira veya kucukten buyuge" (Natural Order) dizer.
        TreeSet coook yavas calisir.

        tekrarsiz elemanlari natural order'da depolamak icin treeset kullanmak mantiklidir ama treeset'ler cook yavas
        calistigi icin biz elemanlari once hashset'e depolariz sonra hashset'i treeset'e cevirerek treeset'in yavas olma
        problemini asmis oluruz.
         */
        //Example 11:
        //HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        //HashSet List: sari,mavi,kirmizi,yesil,mor
        //Beklenen Çıktı:
        //TreeSet elements:
        //kirmizi
        //mavi
        //mor
        //sari
        //yesil

        HashSet<String> s = new HashSet<>();
        s.add("sari");
        s.add("mavi");
        s.add("kirmizi");
        s.add("yesil");
        s.add("mor");

        System.out.println(s);

        TreeSet<String> t = new TreeSet<>(s);
        System.out.println("t = " + t);


        //Example 12 : Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
        //HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

        HashSet<String> color = new HashSet<>();
        color.add("sari");
        color.add("mavi");
        color.add("yesil");
        color.add("turuncu");
        color.add("kirmizi");
        TreeSet<String> colors = new TreeSet<>(color);
        System.out.println("colors.pollFirst() = " + colors.pollFirst());
        System.out.println("colors.pollFirst() = " + colors.pollFirst());
        System.out.println("colors.pollFirst() = " + colors.pollFirst());
        System.out.println("colors.pollFirst() = " + colors.pollFirst());
        System.out.println("colors.pollFirst() = " + colors.pollFirst());

        //Example 13: Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
        //TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

        TreeSet<String> c1 = new TreeSet<>();
        c1.add("yesil");
        c1.add("mavi");
        c1.add("kirmizi");
        c1.add("sari");
        c1.add("beyaz");
        c1.add("siyah");

        System.out.println(c1.pollFirst());
        System.out.println(c1.pollFirst());
        System.out.println(c1.pollFirst());
        System.out.println(c1.pollFirst());
        System.out.println(c1.pollFirst());
        System.out.println(c1.pollFirst());

        //Example 14: Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
        //TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        //Beklenen Çıktı:
        //Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        //Tersten Siralanisi:
        //yesil
        //turuncu
        //sari
        //mavi
        //kirmizi





    }
}
