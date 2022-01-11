package octoberjavainterviewquestions;

public class palindromestring {

	public static void main(String[] args) {
		String name="a ";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
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
	System.out.println("not");
}
	}


}
