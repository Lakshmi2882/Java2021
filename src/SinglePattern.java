import java.util.HashMap;

public class SinglePattern {

	public static void main(String[] args) {
		int num[]= {1};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++)
		{
			if(!map.containsKey(num[i]))
			{
				map.put(num[i],1);
			}
			else
			{
				map.put(num[i],map.get(num[i])+1);
			}
		}
		
		
		for(int e:map.keySet())
		{
			if(map.get(e)==1)
			{
				System.out.println(e );
			}
			
		}
		

	}

}
