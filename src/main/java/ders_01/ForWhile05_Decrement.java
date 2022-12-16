package ders_01;

public class ForWhile05_Decrement {

    /*
        Print even numbers from 20 to 0 but do not use decrement (i--).
        OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0

        Example 6: Print Alphabet on the console.
                OUTPUT  : a b c .. .. .. .. y z
     */

    public static void main(String[] args) {

        //Example 6:
        for(char c= 'a'; c<='z'; c++) {
            System.out.print(c + " ");
        }



        int sayi =20;
        int i = 0;
        do {
            if (sayi%2==0) {
                System.out.print(sayi + " ");
                sayi -= 2;
            }
        }while (i<=sayi);














    }


}
