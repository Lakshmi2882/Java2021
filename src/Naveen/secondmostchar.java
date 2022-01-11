package Naveen;

import java.util.HashMap;

public class secondmostchar {

	public static void main(String[] args) {
	String name="DecemberD";
	char[] ch=name.toCharArray();
	System.out.println(ch.length);
	int count=1;
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	
	for(int i=0;i<ch.length;i++)
	{
		if(!map.containsKey(ch[i]))
		{
			map.put(ch[i], count);
			
		}
		else
		{
			map.put(ch[i],map.get(ch[i])+1);
			
		}
	}
 
 for(char e:map.keySet())
 { if(map.get(e)==2)
 {
	 System.out.println(e);
 }
 }
 

}
}
