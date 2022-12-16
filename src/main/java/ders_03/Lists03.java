package ders_03;

import java.util.Scanner;

public class Lists03 {
    /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.
        Note: Upper and lower case letters, spaces and special characters will not be changed.
        Input :
        It is very nice to write code.
        Output :
        .edoc etirw ot ecin yrev si tI
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle");
        String s = input.nextLine();

        String arr[] = s.split("");
        String sum="";

        for(int i=arr.length-1; i>-1; i--){
            char c = s.charAt(i);
            sum+=c;
        }
        System.out.println(sum);

        //2.yol
        System.out.println("bir cumle girin");
        StringBuilder bu = new StringBuilder(input.nextLine());
        bu.reverse();
        System.out.println(bu);

    }
}
