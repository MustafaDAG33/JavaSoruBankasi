package ders_03;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    /*
        Write a program that deletes the letters 'a' from the names in the list given as input.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :
         [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> isim = new ArrayList<>();
        isim.add("Ali");
        isim.add("Veli");
        isim.add("Ayse");
        isim.add("Fatma");
        isim.add("Omer");



        for(int i=0; i<isim.size(); i++){
            if(isim.get(i).contains("a") || isim.get(i).contains("A")){
                isim.remove(isim.get(i));
            }
        } System.out.println(isim);







    }
}
