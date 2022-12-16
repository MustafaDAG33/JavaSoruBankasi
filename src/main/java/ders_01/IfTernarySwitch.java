package ders_01;

import java.util.Scanner;

public class IfTernarySwitch {
    public static void main(String[] args) {

        //Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
        //If given integers or the sum have more than 10 digits, print "overflow".
        //EXAMPLE:
        //INPUT      :
        //Input two integers:25 46
        //OUTPUT :
        //Sum of the numbers: 71

        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        float sayi1 = scan.nextFloat();
        float sayi2 = scan.nextFloat();

        float sum = sayi1 + sayi2;

        if(sum>999999999){
            System.out.println("overflow");
        }else if(sayi1>0 && sayi2>0){
            System.out.println("sum of the numbers = " + sum);
        }else{
            System.out.println("gecersiz sayi");
        }

        //Write a switch statement that tests the value of the char variable response and performs the following actions:
        //if response is a, the message Your request is being processed is printed
        //if response is b, the message Thank you anyway for your consideration is printed
        //if response is c, the message Sorry, no help is currently available is printed for any other value of response, the message "Invalid entry, please try again!" is printed
        //Create Scanner object.
        //Use charAt() method, in order to get the char value at the specified index.
        //Example:
        //-Display prompt: "Enter command:"
        //input: a
        //-Display prompt:
        // "Your request is being processed"

        System.out.println("Enter command");
        char c = scan.next().charAt(0);


        switch(c){
            case 'a' :
                System.out.println("Your request is being processed");
                break;
            case 'b' :
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'c' :
                System.out.println("Sorry, no help is currently available");
                break;
            default :
                System.out.println("Invalid entry, please try again!");

        }
        System.out.println(c);

        //Ask user to type a name,
        //the length of name should be 3.
        //Then check if the name has same characters.
        //If the String has same characters
        //Print “String has duplicate characters”
        //Else
        //Print “String has unique characters”
        //Please use ternary.
        //Input :
        //ala
        //OutPut:
        //String has duplicate characters

        System.out.println("bir isim girin");
        String name = scan.next();

        String k = name.length()==3 ? name.indexOf(name.charAt(0))== name.lastIndexOf(name.charAt(0)) ? "String has unique characters" : "String has duplicate characters" :
                "string should be 3";

        System.out.println(k);




    }
}
