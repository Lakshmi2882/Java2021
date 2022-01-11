package octoberjavainterviewquestions;

import java.util.HashMap;

public class duplicatecharacter {

	public static void main(String[] args) {
		String name="Radhikakh";
		char[] c=name.toCharArray();
		int count=1;
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], count);
			}
			else
			{
				map.put(c[i], map.get(c[i])+1);
			}
		}
		for(char e:map.keySet())
		{
			//System.out.println(e+":"+map.get(e));
			if(map.get(e)>1)
				System.out.println(e+":"+map.get(e));

		}
		
	}
}

	