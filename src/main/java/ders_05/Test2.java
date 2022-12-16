package ders_05;

public class Test2 {
    public static void main(String[] args) {

        Test1 t= new Test1(11.5,7,9);//private ulasamayiz
        t.powerSwitch();//private ulasamayiz
        System.out.println(t.channelTuning(2));//54.89
        System.out.println(t.decreaseVolume());//11



    }
}
