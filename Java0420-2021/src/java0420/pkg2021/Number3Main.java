package java0420.pkg2021;

import java.util.*;

public class Number3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(3);
        Numbers.add(8);
        Numbers.add(23);
        Numbers.add(98);
        Numbers.add(6);
        Numbers.add(1);

        int min = Numbers.get(0);
        int index = 0;
        for (int i = 0; i < Numbers.size(); i++) {
            if (min > Numbers.get(i)) {
                min = Numbers.get(i);
                index = i;
            }
        }
        while (index > 0) {
            Numbers.set(index, Numbers.get(index - 1));
            index--;
        }
        Numbers.set(0, min);
        System.out.println(Numbers);

    }

}
