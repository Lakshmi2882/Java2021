package octoberjavainterviewquestions;

import java.util.Arrays;

public class anagramnotusingstring {

	public static void main(String[] args) {
		

	}
 public  static boolean isAnagram(String s1,String s2)
 {
	 String str1=s1.replaceAll("\\s", "");
	 String str2=s2.replaceAll("\\s", "");
	 if(str1.length()!=str2.length())
	 {
		 return false;
	 }
	 else
	 {
		 for(int i=0;i<str1.length();i++)
		 {
			 for(int j=0;j<str2.length();j++)
			 {
				 if(str1.charAt(i)==str2.charAt(i))
				 {
					 str1.
				 }
			 }
		 }
	 }
 }
}
