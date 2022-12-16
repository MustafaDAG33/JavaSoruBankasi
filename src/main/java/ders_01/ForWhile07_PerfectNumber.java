package ders_01;

public class ForWhile07_PerfectNumber {
    public static void main(String[] args) {
        /*
            Write java code checking the number is Perfect number or not.
            Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
                Input :6
                Output:6 is Perfect Number
                Input :7
                Output:7 is not Perfect Number
         */

        int sayi = 32;
        int sum = 0;

        for(int i=1; i<sayi; i++) {
            if(sayi%i==0){
                sum +=i;
            }
        }

        if(sum==sayi) {
            System.out.println(sayi + " is perfect number");
        }else{
            System.out.println(sayi + " is not perfect number");
        }



    }
}
