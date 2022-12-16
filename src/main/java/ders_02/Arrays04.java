package ders_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays04 {

    /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.
        (do not use toCharArray() method)
        Input : John
        Output :[J, o, h, n]
     */

    public static void arrayYap (String s){

        char arr[] = new char[s.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        arrayYap("John");
    }







}
