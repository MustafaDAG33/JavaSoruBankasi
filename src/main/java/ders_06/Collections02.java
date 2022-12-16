package ders_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collections02 {
    public static void main(String[] args) {

        //Example 6: Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        //LinkedList elemanları: sari,mavi,mor,yesil,beyaz

        List<String> list1 = new LinkedList<>();

        list1.add("sari");
        list1.add("mavi");
        list1.add("mor");
        list1.add("yesil");
        list1.add("beyaz");
        System.out.println(list1);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        //example 7: bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
        //LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        //1. elemandan itibaren yazdıralım.

        List<String> list2 = new LinkedList<>();

        list2.add("sari");
        list2.add("beyaz");
        list2.add("mavi");
        list2.add("yesil");
        list2.add("turuncu");


        ListIterator<String> l = list2.listIterator();


        while(l.hasNext()){

            String str = l.next();
            System.out.println(str);
        }

        //Example 8: Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
        //LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz



        //Example 9: Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
        //LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor



        //Example 10: Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
        //LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
        //**hint:  Collections.swap();**
        //Beklene Çıktı:
        //Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        //Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]



    }
}
