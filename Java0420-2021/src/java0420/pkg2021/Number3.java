
package java0420.pkg2021;

import java.util.*;

public class Number3 {
    public static void main(String[] args)
    {

        Integer arr[] = {1,2,3,4,5,6,7,8,9,10,0};
   
        System.out.println("Array of numbers : " +
                                Arrays.toString(arr));
           
        Collections.rotate(Arrays.asList(arr), 1);
           
        System.out.println("New Content : " +
                                Arrays.toString(arr));
}
}
