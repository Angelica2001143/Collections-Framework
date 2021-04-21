
package java0420.pkg2021;
import java.util.*;

public class Number7 {
    
    public static void uniqueValues() {
        
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(21);
        set1.add(20);
        set1.add(18);
        set1.add(19);
        set1.add(25);
        
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(21);
        set2.add(20);
        set2.add(10);
        set2.add(19);
       

        Set set3 = new HashSet(set1);
        set3.retainAll(set2);
        set1.removeAll(set3);
        set2.removeAll(set3);

        //make the hashset to integer
        int[] numA = set1.stream().mapToInt(Integer::intValue).toArray();
        int[] numB = set2.stream().mapToInt(Integer::intValue).toArray();

        //get first the length of an array then concatenate or merge 
        int set1Length = numA.length;
        int set2Length = numB.length;
        int[] result = new int[set1Length + set2Length];
        System.arraycopy(numA, 0, result, 0, set1Length);
        System.arraycopy(numB, 0, result, set1Length, set2Length);
        System.out.println("This are the UNIQUE Values: \n" + Arrays.toString(result) + "\n");
    }
}
