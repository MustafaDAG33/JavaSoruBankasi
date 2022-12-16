package ders_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists05 {

    /*
        Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
        Check numbers if they are even or not in a return method.
        Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        List<Integer> asal = new ArrayList<>();

        int counter = 0;

        for(int i=2; i<asal.size(); i++){
            if(sayi%i==0){
                counter++;
            }
        }

        if(counter==0){
            asal.add(sayi);
        }



        System.out.println(asal);


    }
}
