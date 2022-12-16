package ders_05;

public class Conditions {
    //Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    //Yarım elmas uzunluğu : 7
    //Beklenen Çıktı:

    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
    //*************
    // ***********
    //  *********
    //   *******
    //    *****
    //     ***
    //      *
    public static void main(String[] args) {

        for(int i=1; i<=7; i++){

            for(int bosluk=i; bosluk<=7; bosluk++){
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++){

                System.out.print("* ");
            }

            System.out.println();
        }



        //Example 2: 5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
        //Beklenen Çıktı:
        //      1
        //     1 1
        //    1 2 1
        //   1 3 3 1
        //  1 4 6 4 1

//        for(int i=1; i<=5; i++){
//
//            for(int bosluk=i; bosluk<=5; bosluk++){
//                System.out.print(" ");
//
//            }
//
//            for(int k=1; k<=i; k++){
//
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }


    }
}
