package pavan;

import java.util.HashSet;

public class DuplicatecharactersInaString {

	public static void main(String[] args) {
		String str="Radhikah";
	char[] ch=	str.toCharArray();
	HashSet<Character> hs=new HashSet<Character>();
	for(char e:ch)
	{
	      if(hs.add(e)==true)
	      {
	    	  System.out.println(e);
	      }
	}
   
	}

}
