package javaprogrammingquestions;

public class stringpalindrome {

	public static void main(String[] args) {
		String name="racecar";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(name))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
