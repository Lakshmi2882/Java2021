import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {

	public static void main(String[] args) {
		String code="aaaaaabbbbbccccccccccccccccccccccccccccdd";
	char[]ch=	code.toCharArray();
	int count=1;
	Map<Character,Integer> hs=new HashMap<Character,Integer>();
	for(int i=0;i<ch.length;i++)
	{
		if(!hs.containsKey(ch[i]))
		{ 
			hs.put(ch[i], count);
		}
		else
		{
			hs.put(ch[i],hs.get(ch[i])+1);
		}
	}
		for(char e:hs.keySet())
		{
			if(hs.get(e)<=9)
			{
				System.out.println(e+":"+hs.get(e));
		}
	}
}
}


