package ders_06;

import java.util.*;

public class Collections01 {
    public static void main(String[] args) {

        //Example 1: Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın
        //Array elemanları:  siyah,sari,mavi,turuncu

        List<String> renk = new ArrayList<>(Arrays.asList("siyah","sari","mavi","turuncu"));
        System.out.println("renk = " + renk);

        //Example 2: Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
        //Array List:  siyah,mavi,kirmizi,beyaz
        //en başa: **pembe**
        //mavi-kirmizi arasına **yesil**  renk eklenecek.
        //Beklenen Çıktı:`
        //[pembe,siyah,mavi,yesil,kirmizi,beyaz]

        List<String> list = new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","beyaz"));
        list.add(0,"pembe");
        list.add(3,"yesil");
        System.out.println("list = " + list);

        //Example 3:Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
        //ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
        //Beklenen Çıktı:
        //Arrayin 1. elemani: beyaz
        //Arrayin 3. elemani: sari

        ArrayList<String> color = new ArrayList<>(Arrays.asList("beyaz","siyah","sari","kirmizi","turuncu"));
        System.out.println("Array'in 1. elemani = " + color.get(0));
        System.out.println("Array'in 3. elemani = " + color.get(2));

        //Example 4: Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        //Array Elemanları: sari,yesil,mavi,pembe
        //**mavi rengini turuncu ile değiştirelim.**

        List<String> colors = new ArrayList<>(Arrays.asList("sari","yesil","mavi","pembe"));
        colors.set((colors.indexOf("mavi")), "turuncu" );
        System.out.println("colors = " + colors);

        //Example 5: Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        //ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

        List<String> r = new ArrayList(Arrays.asList("siyah","mavi","kirmizi","yesil","mor","turuncu"));
        System.out.println("r = " + r);
        System.out.println(r.get(0));
        System.out.println(r.get(1));
        System.out.println(r.get(2));




    }
}
