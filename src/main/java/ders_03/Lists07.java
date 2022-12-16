package ders_03;

public class Lists07 {

    /*
        Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and
        checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
        Input :
        I love Java.
        Output:
        Reversed sentence : avaJ evol I.
        It is not a palindrome"
     */
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("I love Java.");
        s.reverse();
        System.out.println(s);





    }
}
