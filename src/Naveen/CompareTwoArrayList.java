package Naveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
         ArrayList<String> list2=new ArrayList<String>(Arrays.asList("c","d"));
         //to sort arraylist need to use collections
         Collections.sort(list1);
         Collections.sort(list2);
         System.out.println(list1.equals(list2));
         //compare two arrays find extra element in second list
         ArrayList<String> list3=new ArrayList<String>(Arrays.asList("bbb","cccc","eeee"));
         ArrayList<String> list4=new ArrayList<String>(Arrays.asList("bbb","ffff"));
         Collections.sort(list3);
         Collections.sort(list4);
        //list3.removeAll(list4);
        // System.out.println(list3);
         //find out common elements
      list3.retainAll(list4);
      System.out.println(list3);
     
       
        
        
         
	}

}
