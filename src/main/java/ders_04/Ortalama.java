package ders_04;

public class Ortalama {
    /*
        Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
        Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
        Ornek Cikti:
        Sayilarin Ortalamasi : 30
     */

    public void ortalamayiHesapla(int ...a){
        int sum=0;
        for(int w : a){
            sum+=w;
        }
        System.out.println(sum/a.length);
    }

    public static void main(String[] args) {
        Ortalama ortalama = new Ortalama();
        ortalama.ortalamayiHesapla(1,2,3,4,5,6,7,8,9);
    }




}
