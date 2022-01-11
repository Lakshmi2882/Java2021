package pavan;

import java.util.Arrays;
import java.util.HashMap;

public class NoOfTimesCharactersRepeated {

	public static void main(String[] args) {
		String name="banana";
	char[] ch=	name.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i],1);
			}
			else
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
for(char c:map.keySet())
{ Arrays.sort(ch);
	System.out.println("number of times occurance of  "+ c+ "  is" + " :"+map.get(c));
}
	}

}
