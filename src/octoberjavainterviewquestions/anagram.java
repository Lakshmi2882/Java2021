package octoberjavainterviewquestions;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
	System.out.println(isAnagram("0l","l0"));

	}
	public static boolean isAnagram(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char[]c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}

}
