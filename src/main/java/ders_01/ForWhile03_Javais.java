package ders_01;

import java.util.Arrays;

public class ForWhile03_Javais {
    public static void main(String[] args) {

        //Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple
        //Input :
        //30 and 40
        //Expected OutPut:
        //GCD for 30 and 40 = 10
        //LCM for 30 and 40 = 120












        //Write a code that returns the duplicate chars in a String array.(interview Question)
        //Input :
        //String str=“Javaisalsoeasy”
        //Output: [a, s]

        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        String result = "";

        for(String w : arr) {

            if(str.indexOf(w)!= str.lastIndexOf(w)){

                if(result.contains(w)){
                    continue;
                }
                result+=w;
            }


        }
        System.out.println(result);
        String arr2[] = result.split("");
        System.out.println(Arrays.toString(arr2));

        //2.yol

        String str2 = "Javaisalsoeasy";
        String sonuc = "";

        for(int i=0; i<str2.length(); i++){
            String k = str2.substring(i, i+1);
            if(str2.indexOf(k)!= str2.lastIndexOf(k) && !sonuc.contains(k)){
                sonuc+=k;

            }
        }
        System.out.println(sonuc);











    }
}
