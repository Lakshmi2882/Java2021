package interviewroxorjava;

import java.util.HashMap;

public class countnumberofwords {

	public static void main(String[] args) {
		String sentence="I am learning Automation Program";
		String Split[]=sentence.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<sentence.length();i++)
		{
			if(map.containsKey(Split[i]))
			{
				int count=map.get(Split[i]);
				map.put(Split[i], count+1);
			}
			else
			{
				map.put(Split[i], 1);
			}
		}
		System.out.println(map);

	}

}
