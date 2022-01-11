package pavan;

import java.util.HashMap;
import java.util.HashSet;

public class duplicateElementinArray {

	public static void main(String[] args) {
		String[] Array= {"java","python","c++","c#","java","ruby","ruby"};
		System.out.println("Using Hashset");
		//set does not contain duplicate values
		HashSet<String> hs=new HashSet<String>();
		for(String e:Array)
		{
			if(hs.add(e)==false)
			{
				System.out.println(e);
			}
		}
 System.out.println("****************");
 System.out.println("Using HashMap");
 HashMap<String,Integer> map=new HashMap<String,Integer>();
 for(String e:Array)
 {
	 if(map.containsKey(e))
	 {
		 map.put(e,map.get(e)+1);
	 }
	 else
	 {
		 map.put(e, 1);
	 }
 }
 for(String k:map.keySet())
 {
	 if(map.get(k)>1)
	 {
		System.out.println(k);
	 }
 }
	}

}
