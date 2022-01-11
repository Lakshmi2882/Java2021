package pavan;

public class Panagram {

	public static boolean IsPanagram(String s)
	{
		if(s.length()<26)
		{
			return false;
		}
		else
			for(char ch='a';ch<='z';ch++)
			{
				if(s.indexOf(ch)<0)
				{
					return false;
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
	String s="The quick brown fox jumps over the laz dog";
	System.out.println(IsPanagram(s));
	

	}

}
