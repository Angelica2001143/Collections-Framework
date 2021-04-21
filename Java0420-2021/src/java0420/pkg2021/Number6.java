package java0420.pkg2021;

import java.util.*;

public class Number6 {

    public static void compareSet() {
       
        Set<String> set1 = new HashSet<String>();
        
        set1.add("Angelica");
        set1.add("Quency");
        set1.add("Girly");
        set1.add("Shenna");
        set1.add("Romeo");

        Set<String> set2 = new HashSet<String>();
       
        set2.add("Sernel");
        set2.add("Victoriano");
        set2.add("Angelica");
        set2.add("Quency");
        set2.add("Girly");

        set1.retainAll(set2);
        System.out.println("Common Values are: ");
        System.out.println(set1 + "\n");

    }
}
