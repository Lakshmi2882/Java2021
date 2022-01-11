package interviewroxorjava;

public class reversestringpalindrome {

	public static void main(String[] args) {
		String name="lakal";
		String rev="";
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		{
		rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
