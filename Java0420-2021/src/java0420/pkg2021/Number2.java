
package java0420.pkg2021;

import java.util.*;

public class Number2 {
    
    public static void main(String[] args)
    {
        ArrayList<String>  names = new ArrayList<String>();
        names.add(" Girly ");   
        names.add(" Quency ");   
        names.add(" Jonalyn ");   
        names.add(" Shenna ");   
        names.add(" Angelica ");
        
  
        System.out.println("Array list : \n" + names);
  
    
        Collections.shuffle(names, new Random());
        System.out.println("\nRearrange list: \n"
                                                     + names);
  
//       Collections.shuffle(names, new Random());
//        System.out.println("\nRearrange list: \n"
//                                                     + names);
  

  
    }
}
    

