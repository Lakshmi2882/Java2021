package Naveen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronization {

	public static void main(String[] args) {
		//1. ArrayList is non synchronised
		//2. it is not a thread safe
		//We can achieve by using collections.synchronised
		List<String>nameslist=Collections.synchronizedList(new ArrayList<String>());
		//to add and remove numbers no need to use synchronization
		nameslist.add("Java");
		nameslist.add("Ruby");
		nameslist.add("Python");
		//to fetch or traverse the values we need to use synchronised method
		synchronized(nameslist)
		{
			Iterator<String> it=nameslist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			
			}
		}
		

	}

	
	

}
