package octoberjavainterviewquestions;

import java.util.HashMap;

public class digitscount {

	public static void main(String[] args) {
		int num=12134;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	while(num>0)
	{
		int r=num%10;
		if(!map.containsKey(r))
		{
			map.put(r, 1);
		}
		else
		{
			map.put(r, map.get(r)+1);
		}
		num=num/10;
	}
 //print value
	for(int e:map.keySet())
	{
		System.out.println(e+":"+map.get(e));
	}
	}

}
