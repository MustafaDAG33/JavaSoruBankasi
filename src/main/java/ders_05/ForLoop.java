package ders_05;

public class ForLoop {
    //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
    //Input : 6
    //Output: 6!=6*5*4*3*2*1=720

    public static void faktoriyel(int sayi){
        int sum=1;
        String toplam ="";
        int i=1;
        while(i<=sayi){
            sum=sum*i;
            toplam = i + "*"+ toplam;
            i++;
        }
        System.out.println(sayi + "!"+"="+   toplam +"="+ sum  );
    }


    public static void mukemmel(int sayi) throws Exception {

        //2.soru
        //Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
        //Input :6
        //Output:6 Mukemmel Sayidir

        int sum=0;

        for(int i=1; i<sayi; i++ ){
            if(sayi%i==0){
                sum+=i;
            }
        }
        if(sayi<0){
            throw new Exception("hata !! .. Pozitif sayi giriniz");
        }

        if(sum==sayi){
            System.out.println(sayi + " sayisi mukemmel sayidir");
        }else{
            System.out.println(sayi + " sayisi mukemmel sayi degildir");
        }






    }

    public static void main(String[] args) throws Exception {
        faktoriyel(6);


        try{
            mukemmel(-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }





    }
}
