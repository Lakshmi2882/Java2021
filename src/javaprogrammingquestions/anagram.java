package javaprogrammingquestions;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
Anagram("Radhiuka","Radha");
	}
	public static boolean Anagram(String Ename,String Fname)
	{
		char [] arrEname=Ename.toCharArray();
		char[] arrFname=Fname.toCharArray();
		Arrays.sort(arrFname);
		Arrays.sort(arrEname);
	return 	Arrays.equals(arrEname, arrFname);

	}

}
