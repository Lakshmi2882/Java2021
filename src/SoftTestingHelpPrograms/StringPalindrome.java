package SoftTestingHelpPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String word="MOMS";
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
System.out.println(rev);
if(rev.equalsIgnoreCase(word))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
	}

}
