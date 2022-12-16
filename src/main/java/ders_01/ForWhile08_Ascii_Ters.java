package ders_01;

public class ForWhile08_Ascii_Ters {
    public static void main(String[] args) {

        /*
                Write a Java program that prints ascii values of characters from ‘a’ to ‘z’

Expected Output:

Ascii value of a = 97
Ascii value of b = 98
Ascii value of c = 99
Ascii value of d = 100
Ascii value of e = 101
Ascii value of f = 102
Ascii value of g = 103
Ascii value of h = 104
Ascii value of i = 105
Ascii value of j = 106
Ascii value of k = 107
Ascii value of l = 108
Ascii value of m = 109
Ascii value of n = 110
Ascii value of o = 111
Ascii value of p = 112
Ascii value of q = 113
Ascii value of r = 114
Ascii value of s = 115
Ascii value of t = 116
Ascii value of u = 117
Ascii value of v = 118
Ascii value of w = 119
Ascii value of x = 120
Ascii value of y = 121
Ascii value of z = 122
         */

        for(char c= 'a'; c <= 'z'; c++) {
            int a = Character.valueOf(c);
            System.out.println("Ascii value of " + c + " = " + a);


        }

        //Write a java program to reverse the number which user entered.
        //Input  :1238
        //Output :Reverse Of The Number: 8321


        StringBuilder x = new StringBuilder();
        x.append("1238");
        x.reverse();
        System.out.println(x);

        //2.yol
        String y = "123800";
        String sum = "";

        int i = y.length()-1;

        do{
            char c = y.charAt(i);
            sum+=c;
            i--;

        }while(i>-1);
        System.out.println(sum);





    }
}
