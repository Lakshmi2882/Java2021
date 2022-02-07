package Naveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class naveenproblem2 {

	public static void main(String[] args) {
		String str="aaabbccccdee";
	char[] ch=	str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i],1);
			}
			else
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
for(Map.Entry<Character,Integer>entry:entryset)
{ 

	System.out.print(entry.getKey()+""+entry.getValue());

}


	}

}
