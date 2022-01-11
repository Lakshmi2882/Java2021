package pavan;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
System.out.println(isAnagram("listen","silent"));
	}
	public static boolean isAnagram(String str1, String str2)
	{   char[] ch1=str1.toCharArray();
	     char[] ch2=str2.toCharArray();
	     Arrays.sort(ch1);
	     Arrays.sort(ch2);
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}
		return true;
		

}
}
