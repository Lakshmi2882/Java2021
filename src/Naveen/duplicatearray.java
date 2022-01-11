package Naveen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class duplicatearray {

	public static void main(String[] args) {
		String[] name= {"java","ruby","python","java","ruby"};
		
		Set<String> store=new HashSet<String>();//will store unique values
		//set is an interface
		//parent of set is collection
		for(String names:name)
		if(store.add(names)==false)
		{
			System.out.println("duplicate values:"+names);
		}
		System.out.println("******");
		System.out.println("using hashmap");
		HashMap<String,Integer>map=new HashMap<String,Integer>();//blank
		for(String e:name)
		{ Integer count=map.get(e);//it has null
		if(count==null)
		{
			map.put(e, 1);
		}
		else
		{
			map.put(e,++count);
		}
		}
	for(String e1:map.keySet())
	{
		if(map.get(e1)>1)
		{
			System.out.println("duplicate "+e1);
		}
	}
		
	}

}
