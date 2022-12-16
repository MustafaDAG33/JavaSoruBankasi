package ders_04;

public class Interview {
    /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
        int a= 3;
        int b= 5;
        Ornek Cikti:
        a=5
        b=3
     */
    public static void main(String[] args) {
        int a= 3;
        int b= 5;
//
//        int temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println(a);
//        System.out.println(b);

        //2.yol
        a=b-a;//2
        b=b-a;//3
        a=a+b;//5
        System.out.println(a);
        System.out.println(b);




    }
}
