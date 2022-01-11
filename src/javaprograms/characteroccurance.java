package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class characteroccurance {

	public static void main(String[] args) {
		

	}
	public static void findcharacteroccurance(String str)
	{
		if(str==null)
		{
			System.out.println("it is a null string");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("it is a empty string");
		}
		if(str.length()==1)
		{System.out.println("it is a single character string");
		char words[]=str.toCharArray();
	Map<Character,Integer> charactermap=new HashMap<Character,Integer>();
	for(Character ch:words)
	{
		if(charactermap.containsKey(ch))
		{
			charactermap.put(ch,charactermap.get(ch)+1);
		}
		else
		{
			charactermap.put(ch, 1);
		}
	}
Set<Map.Entry<Character,Integer>>entryset=	charactermap.entrySet();
for(Map.Entry<Character, Integer>entry:entryset)
{
	if(entry.getValue()>1)
	{System.out.println(entry.getKey()+":"+entry.getValue());
}
		
	}

}
	}
}
