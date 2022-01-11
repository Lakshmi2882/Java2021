package pavan;

import java.util.HashMap;
import java.util.Map.Entry;

public class countOccurenceInaString {

	public static void main(String[] args) {
		String s="Raddhika";
	char[]ch=	s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i], 1);
			}
			else
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for( Entry<Character, Integer> entry:map.entrySet())
		{
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
System.out.println(sb.toString());
	}

}
