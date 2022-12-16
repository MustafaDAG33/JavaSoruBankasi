package ders_02;

public class Arrays02_Reverse {
    /*
        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
        Input  : Coding is greate.
        Output : .etaerg si gnidoC
     */

    public static String reverse (String a){

        String arr[] = a.split("");
        String sum = "";
        for(int i=a.length()-1; i>-1; i--){
            char c = a.charAt(i);
            sum+=c;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Coding is greate."));
    }
}
