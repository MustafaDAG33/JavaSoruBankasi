package ders_02;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Arrays07 {

    /*
        Write a method that accepts an array as parameter and returns sum off all elements in the array
        Then print the result in the main method.
        Eg :
        input : {1,2,3,4,5,6,7,8};
        output: 36
     */

    public static void topla (int[] s){

        int sum=0;

        for(int i=0; i<s.length; i++){
            sum+=s[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int brr[] = {10,2,3,4,5,6,7,8};
        topla(brr);



    }
}
