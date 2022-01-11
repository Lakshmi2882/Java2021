package Javacoding;

public class paranthesisValidorInvalid {

	public static void main(String[] args) {
		String str="{{{}}}";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='{')
		{
			count++;
		}
		else
			if(str.charAt(i)=='}')
			{
				count--;
			}
	}
	if(count==0)
	{
		System.out.println("valid");
	}
	else
	{
		System.out.println("invalid");
	}

	}

}
