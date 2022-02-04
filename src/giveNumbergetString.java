import java.util.HashMap;

public class giveNumbergetString {

	public static void main(String[] args) {
		int[] i= {1,2,3,4};
		String[] str= {"one","two","three","four"};
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		if(i.length==str.length)
		{
			for(int j=0;j<i.length;j++)
			{
				map.put(i[j],str[j]);
			}
		}
		for(Integer e:map.keySet())
		{
			System.out.println(map.get(e));
		}
	}

}
