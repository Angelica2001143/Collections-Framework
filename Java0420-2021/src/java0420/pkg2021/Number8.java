package java0420.pkg2021;

import java.util.*;

public class Number8 {

     public static void CountNumberKeys(){
       HashMap<String,String> kcount = new HashMap <String,String>();
       
       kcount.put("name","Daniel");
       kcount.put("color1","Pink");
       kcount.put("fruit","Orange");
       kcount.put("name2","Kim Chui");
       kcount.put("name4","Patrick");
       kcount.put("color2","Violet");
       kcount.put("color3","Brown");
       kcount.put("fruit","Banana");
       kcount.put("name3","Vero");
       
       
       int counter=0;
       for (String keys : kcount.keySet()){
           if(keys.startsWith("name")){
               counter++;
           }
       }
  
      System.out.println("The number of keys in a map that starts with 'name' are: " + counter);
      
   }
}
   
