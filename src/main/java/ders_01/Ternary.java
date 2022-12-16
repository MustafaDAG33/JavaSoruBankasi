package ders_01;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        //Ask user to their weight and height and type a program with calculates mass index
        //* HINT : Body Mass Index = Weight (kg) / Square of height (m)
        //Then give a message to user as following:
        //If BMI is less than 18.5 , you re weak
        //If BMI is between 18.5 and 25 , your weight is ideal
        //If BMI is between 25 and 30, you re fat
        //If BMI is more than or equal to 30, obese
        //EXAMPLE :
        //INPUT:
        //Weight : 71
        //Height : 1,72
        //OUTPUT :
        //Your BMI is  : 23.99945916711736
        //Your weight is ideal

        Scanner input = new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo = input.nextDouble();

        double bmi = kilo/(boy*boy);

        String s = bmi<18.5 ? "you are weak" : bmi>=18.5 && bmi<25 ? "your weight is ideal" : bmi>=25 && bmi<30 ? "you re fat" : bmi>=30 ? "obese" : "gecersiz";
        System.out.println("your bmi is :" + bmi);
        System.out.println("your weight is : " + s);

        //Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
        //(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
        //Input :
        //John White 1234234534561478
        //Output :
        //Name : J*** W****
        //CCN  : **** **** **** 1478

        System.out.println("ad ve soyad giriniz");
        String name = input.next();
        System.out.println("16 haneli kart no giriniz");
        String card = input.next();










    }
}
