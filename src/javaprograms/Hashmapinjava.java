package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Hashmapinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String>map=new HashMap<Integer,String>();
		map.put(12, "Swaraj");
		map.put(15, "Lakshmi");
		map.put(20, "Radhika");
		map.put(12, "lll");
		map.put(null, "ppp");
		map.put(null, "wwww");
		map.put(123,"");
		map.put(124, null);
		for(Map.Entry<Integer,String> e:map.entrySet())
		{System.out.println(e.getKey()+" "+e.getValue());
			
		}

	}

}
