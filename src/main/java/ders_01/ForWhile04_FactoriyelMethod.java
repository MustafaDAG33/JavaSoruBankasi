package ders_01;

public class ForWhile04_FactoriyelMethod {
    public static void main(String[] args) {

        /*
            Write a return method that accepts an integer as input and calculates factorial and prints like output.
            Input : 6
            Output: 6!=6*5*4*3*2*1=720
         */

        System.out.println(factorial(6));

    }

    public static int factorial(int a){
        int result =1;
        for(int i=1; i<=a; i++){
            result=result*i;
        }
        return result;

    }
}
