import java.util.HashMap;
import java.util.Map;

public class Wordpattern {

	public static void main(String[] args) {
//		String pattern="abba";
//		String s="dog cat cat dog";
		

	System.out.println(isPattern("abba","dog cat cat dog"));

	}
	public static boolean isPattern(String pattern,String s)
	{ String[] str=s.split(" ");
if(pattern.length()!=str.length)
{
	return false;
}
Map<Character,String> map=new HashMap<Character,String>();
for(int i=0;i<pattern.length();i++ )
{
	if(map.containsKey(pattern.charAt(i)))
	{
		if(!map.get(pattern.charAt(i)).equalsIgnoreCase(str[i]))
				{
			return false;
				}
	}
	else
		if(map.containsValue(str[i]))
		{
			return false;
		}
	map.put(pattern.charAt(i), str[i]);
}
return true;
}
	
}