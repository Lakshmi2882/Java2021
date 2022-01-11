package octoberjavainterviewquestions;

import java.util.Arrays;

public class anagramoftwostrings {

	public static void main(String[] args) {
		String str1="AAABBC";
		String str2="AAAB";
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("two strings are anagram");
		}
		else
		{
			System.out.println("two strings are not");
		}

	}

}
