package Naveen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateelementsinArray {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("java","python","ruby","c","java","ruby","c","c");
	int count=1;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<names.size();i++)
		{ 
			if(map.containsKey(names.get(i)))
			{
				map.put(names.get(i), count);
			}
			else
			{
				map.put(names.get(i),count+1);
			}
		}
		
		for(String e:map.keySet())
		{
			if(count==1)
			{
				System.out.println(e);
			}
		}

	}

}
