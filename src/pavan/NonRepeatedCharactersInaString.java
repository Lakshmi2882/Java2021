package pavan;

import java.util.HashSet;

public class NonRepeatedCharactersInaString {

	public static void main(String[] args) {
		String SocialMedia="twitter";
	char[]  ch=	 SocialMedia.toCharArray();
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
