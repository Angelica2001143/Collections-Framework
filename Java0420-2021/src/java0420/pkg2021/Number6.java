package java0420.pkg2021;

import java.util.*;

class Number6 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(
                new Integer[]{1, 2, 3, 4, 5, 6, 7}));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(
                new Integer[]{1, 4, 5, 6}));

        Set<Integer> common = new HashSet<Integer>(set1);
        common.retainAll(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.print("COMMON VALUES: " + common);

    }
}
