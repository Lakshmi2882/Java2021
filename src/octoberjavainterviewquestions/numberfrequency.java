package octoberjavainterviewquestions;

import java.util.HashMap;

public class numberfrequency {

	public static void main(String[] args) {
		int num=-89;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	if(num<=0)
	{
		System.out.println("enter correct number");
	}
	while(num >0)
	{

	int r=num%10;//1
	num=num/10;//12
if(!map.containsKey(r))
{
	map.put(r, 1);
}
else
{
	map.put(r, map.get(r)+1);
}
	}
	
for(int e:map.keySet())//keyset is to view keys ina map
{
	System.out.println(e +":"+ map.get(e));
}


	}

}
