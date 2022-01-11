package Naveen;

public class RDAUTOREVERSE {

	public static void main(String[] args) {
		String name="";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
System.out.println("reverse string:"+rev);
if(name.equalsIgnoreCase(rev))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("not Palindrome");
}
	}

}
