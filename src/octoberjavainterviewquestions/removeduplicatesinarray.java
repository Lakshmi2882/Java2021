package octoberjavainterviewquestions;

import java.util.HashMap;

public class removeduplicatesinarray {

	public static void main(String[] args) {
		int num[]= {2,3,4,3,2,5,2};
	//	Arrays.sort(num);//2,2,2,3,3,4,5
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		int j=0;
		for(int i=0;i<num.length;i++)
		{
			if(!map.containsValue(num[i]))//2
			{
				map.put(j,num[i]);
				j++;
			}
		}
		System.out.println(map);
		for(Integer e:map.keySet())
		{
			System.out.print(map.get(e)+" ");
		}

}
}
