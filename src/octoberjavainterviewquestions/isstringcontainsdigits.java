package octoberjavainterviewquestions;

public class isstringcontainsdigits {

	public static void main(String[] args) {
		
System.out.println(checkdigits("£123$"));
	}
	public static boolean checkdigits(String cs)
	{ if(cs.isEmpty())
	{
		return false;
	}
		for(int i=0;i<cs.length();i++)
		{
			if(Character.isDigit(cs.charAt(i)))
			{
				return true;
			}
		}
		return false;
	}

}
