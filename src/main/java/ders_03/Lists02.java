package ders_03;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

    /*
        Create a 10-element list. Swap the 8th element with the 3rd element.
        INPUT :
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        Output:
        [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("umit");
        name.add("emin");
        name.add("kemal");
        name.add("kerem");
        name.add("taylan");
        name.add("orhan");
        name.add("sinan");
        name.add("furkan");
        name.add("ahmet");
        name.add("ali");

        name.set(name.indexOf("kemal"), "furkan");
        name.set(7, "kemal");
        System.out.println(name);




    }
}
