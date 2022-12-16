package ders_04;

public class ZamanSaniye {
    //Girilen zamanı saniyeye çeviren bir program yazınız.
    //Örnek Çıktı:
    //1 saat 10 dakika 50 saniye ==>
    //4250 saniye

    public static void saniye (int saat, int dakika, int saniye){
        int s = saat*60*60+dakika*60+saniye;
        System.out.println(s);
    }

    public static void main(String[] args) {
        saniye(1,10,50);
    }

}
