package octoberjavainterviewquestions;

import java.util.HashMap;

public class countwordsinastring {

	public static void main(String[] args) {
		String sentence="I am coding java program for java coding interview";
		int count=1;
	String arr[]=sentence.split(" ");
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	//map is empty
	for(int i=0;i<arr.length;i++)
	{//to store the values
		if(!map.containsKey(arr[i]))
		{
			map.put(arr[i],count);
		}
		else
		{
			map.put(arr[i], map.get(arr[i])+1);
		}
	}
	//to get output
	for(String e:map.keySet())
	{
		System.out.println(e+":" +map.get(e));
	}
		
}


	}


