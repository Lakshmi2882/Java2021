package octoberjavainterviewquestions;

import java.util.Arrays;
import java.util.HashMap;

public class nonrepeatedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="radhika doing automation";
		char[]c=str.toCharArray();//r,a,d,h,i,k,a
		Arrays.sort(c);//a,a,d,h,i,k,r
		int count=1;
		HashMap <Character,Integer> map=new HashMap<Character,Integer>();
		//empty map
		for(int i=0;i<c.length;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], count);
			}
			else
			{
				map.put(c[i],map.get(c[i])+1);
			}
		}
		//to print output
		for(Character e:map.keySet())
		{
			if(map.get(e)==1)
			{
				System.out.println(e);
			}
		}
		}

	}


