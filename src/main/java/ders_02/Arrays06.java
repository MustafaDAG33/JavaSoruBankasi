package ders_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays06 {

    /*
        Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
     */

    public static void maxMin (int[] a){

        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
             max = Math.max(a[i], max);
             min = Math.min(a[i], min);
        }
        System.out.println(max + " " + min);


    }

    public static void main(String[] args) {

        int arr[] = {0, -3, 4, 1, 34, 11,70};
        maxMin(arr);

    }






}
