package octoberjavainterviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortinghashmap {

	public static void main(String[] args) {
		Map<String,String> unsorted=new HashMap<String,String>();
		unsorted.put("one", "Apple");
		unsorted.put("Two", "Banana");
		unsorted.put("Three", "Carrot");
		unsorted.put("four","Donda");
		for(Map.Entry<String, String> e:unsorted.entrySet())
		{
			System.out.println("unsortedKey value is:"+e.getKey());
		}
		
		Map<String,String> sortedmap=new TreeMap<String,String>	(unsorted);	
		for(Map.Entry<String, String> e: sortedmap.entrySet())
		{
			System.out.println("Key value is:"+e.getKey());
		}

	}

}
