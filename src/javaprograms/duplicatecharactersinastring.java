package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecharactersinastring {

	public static void main(String[] args) {
	printDuplicateCharacters("I AM DOING CODING");

	}
	public static void printDuplicateCharacters(String str)
	{
		if(str==null)
		{
			System.out.println("it is a null string");
			return;
		}
		
			if(str.isEmpty())
			{
				System.out.println("it is a empty string");
			}
		 if(str.length()==1)
		{
			System.out.println("single character string");
			return;
		}
		 //now need to make string into character array
		 char words[]=str.toCharArray();
		 Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		 for(Character ch:words)
		 {
			 if(charMap.containsKey(ch))
			 {
				 charMap.put(ch, charMap.get(ch)+1);
			 }
			 else
			 {
				 charMap.put(ch, 1);
			 }
		 }
		 //print the map
		 Set <Map.Entry<Character,Integer>> entrySet=charMap.entrySet();
		 for(Map.Entry<Character, Integer>entry:entrySet)
		 {
			 if(entry.getValue()>1)
			 {
				 System.out.println(entry.getKey()+":"+entry.getValue());
			 }
		 }
	}

}
