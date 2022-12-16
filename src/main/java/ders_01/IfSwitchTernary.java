package ders_01;

import java.util.Scanner;

public class IfSwitchTernary {
    public static void main(String[] args) {

        //Create 2 words : name1 and name2
        //if the name1 has even numbers of characters,
        //then insert the second word in the middle of the first name
        //if the first word has odd numbers
        //Then print the “Name2 cannot be inserted in the name1”
        //e.g:name1= mehmet name2= ahmet
        //Print ==> mehahmetmet

        String name1="Zeynep";
        String name2 = "Zehra";

        String n = name1.substring(0, name1.length()/2);//zey
        String n1 = name1.substring(name1.length()/2);//nep




        if(name1.length()%2==0){
            System.out.println(n + name2 + n1);

        }else{
            System.out.println("Name2 cannot be inserted in the name1");
        }

        //Ask user for a string and print a new string made of 3 copies of the last 2 letters
        //The strings length will be at least 2.
        // Sample:
        //INPUT       : Mustafa
        //OUTPUT      : fafafa

        Scanner scan = new Scanner(System.in);
        System.out.println("En az iki heceli bir kelime girin");
        String s = scan.nextLine();

        s =s.substring(s.length()-2);
        System.out.println(s.repeat(3));





    }
}
