package Javacoding;

import java.util.HashMap;
import java.util.HashSet;

public class reatingElement {

	public static void main(String[] args) {
		int[] num= {1,2,2,3,4,4,5,5,6,6,1,7,7,11,11};
		//set does not store duplicate values
		HashSet<Integer> hs=new HashSet<Integer>();
		//time complexity is o(n)
		for(int e:num)
		{
			if(hs.add(e)==false)
			{
				System.out.println(e);
			}
		}
		System.out.println("_______________________");
		//using hashmap
		//hashmap stores the value key and value pair
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int e:num)
		{
			if(map.containsKey(e))
			{
				map.put(e, map.get(e)+1);
			}
			else
			{
				map.put(e, 1);
			}
		}
		for(int k:map.keySet())
		{
			if(map.get(k)>1)
			{
				System.out.println(k);
			}
		}
}
}
