package ders_04;

public class ToplamaMethodu {
    int num1=100;
    int num2=25;
    public void topla(int a, int b){
        System.out.println(a+b);
    }

    public void hello(String hello, String world){
        System.out.println(hello+"\n"+world);
    }

    public void cikarma(int num1, int num2){
//        this.num1=num1;
//        this.num2=num2;
        System.out.println(num1-num2);
    }
    private void bolme(int num1, int num2) {
        System.out.println(num1/num2);
    }

    private void carpma(int num1, int num2) {
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {

        ToplamaMethodu t = new ToplamaMethodu();
        t.topla(10,20);
        t.hello("Hello", "World!");
        t.cikarma(t.num1, t.num2);
        t.carpma(t.num1, t.num2);
        t.bolme(t.num1, t.num2);
    }



}
