package ders_03;

import java.util.*;

public class Lists01 {

    /*
        Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
        input :
        Learning java is easy
        output:
        maximum occurring character is : a
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String c = input.nextLine().toLowerCase();


        List<String> list = new ArrayList<>(List.of(c.split("")));
        Collections.sort(list);
        System.out.println(list);

        int counter=0;
        int maxKarakter = 0;
        int sayac=0;

        for(int i=1; i<list.size(); i++){
            if(list.get(i-1).equalsIgnoreCase(list.get(i))){
                counter++;
                maxKarakter= Math.max(counter, maxKarakter);
            }
        }

        for(int i=1; i<list.size(); i++){
            if(list.get(i-1).equalsIgnoreCase(list.get(i))){
                sayac++;
                if(sayac==maxKarakter){
                    System.out.println(list.get(maxKarakter));
                }
            }
        }











}


}
