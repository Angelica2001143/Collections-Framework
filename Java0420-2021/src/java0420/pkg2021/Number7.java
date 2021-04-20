package java0420.pkg2021;

import java.util.*;

public class Number7 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(
                new Integer[]{1, 2, 3, 4, 5, 6}));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(
                new Integer[]{1, 4, 5}));

        Set<Integer> unique = new HashSet<Integer>(set1);
        unique.removeAll(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.print("Unique value: " + unique);
    }
}
