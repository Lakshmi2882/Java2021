package ArrayCollection;

import java.util.HashSet;

public class longestSubString {

	public static void main(String[] args) {
		String s="abcdbcda";
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				hs.add(s);
			}
		}
System.out.println(hs);
	}

}
