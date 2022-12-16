package ders_02;

public class Arrays01_Ters {

    //Write a return method to reverse number.
    //Input  : 12345
    //Output : 54321

    public static StringBuilder ters (StringBuilder s){

        s.reverse();
        return s;
    }

    public static String ters1 (String a){
        String sum = "";
        for(int i= a.length()-1; i>-1; i-- ){
            char ch = a.charAt(i);
            sum+=ch;
        }
        return sum;
    }



    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("Ahmet");
        System.out.println(ters(s));

        System.out.println(ters1("Mustafa"));


    }




}
