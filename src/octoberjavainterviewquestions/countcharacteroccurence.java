package octoberjavainterviewquestions;

import java.util.HashMap;

public class countcharacteroccurence {

	public static void main(String[] args) {
		String sentence="my name is radhika.I am coding";
		int count=1;
		//it is an empty map
		char arr[] =sentence.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
			map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		for(char e:map.keySet())
		{
			System.out.println(e+":"+map.get(e));
		}
		}
		//map.forEach((k,v)-> System.out.println(k+":"+v));
		}
	


