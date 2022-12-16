package ders_02;

import java.util.Arrays;

public class Arrays08 {

    /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
     */

    public static int[] birlestir (int[] a, int[] b){
        int c = a.length + b.length;
        int arr[] = new int [c];
        for(int i=0; i<a.length; i++){
            arr[i] = a[i];
        }
        for(int i=0; i<b.length; i++){
            arr[a.length+i]=b[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={5,6,8,7,0};
        int brr[]={2,3,4,6,8};
        System.out.println(Arrays.toString(birlestir(arr, brr)));
    }







}
