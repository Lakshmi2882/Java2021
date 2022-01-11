package Naveen;

public class ParenthesisChecker {

	public static void main(String[] args) {
		String paren="{}{}{>}{{";
		int count=0;
		for(int i=0;i<paren.length();i++)
		{
			if(paren.charAt(i)=='{')
			{
				count=count+1;
			}
			else
			{ if(paren.charAt(i)=='}')
			{
				count=count-1;
			}
			}
		}
		if(count==0)
		{
			System.out.println("correct parenthesis");
		}
		else
		{
			System.out.println("not correct");
		}

	}

}
