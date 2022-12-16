package ders_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists06 {
    /*

        write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
        Input :{1,2,3,4,5,6}
        element:6
        Output : [1,2,3,4,5]
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);

        //1.yol
        List<Integer> s = new ArrayList<>(Arrays.asList(6));
        list.removeAll(s);

        //2.yol
        list.remove(list.size()-1);
        System.out.println(list);


    }
}
