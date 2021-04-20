package java0420.pkg2021;

import java.util.ArrayList;
import java.util.Collections;

public class Number1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add(" Girly ");
        names.add(" Quency ");
        names.add(" Jonalyn ");
        names.add(" Shenna ");
        names.add(" Angelica ");
        System.out.println(" LIST OF NAME: " + names);

        Collections.sort(names);

        System.out.println("SORTED NAMES: ");
        for (String counter : names) {
            System.out.println(counter);
        }
    }
}
