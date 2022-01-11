package pavan;

public class Stringpalindrome {

	public static void main(String[] args) {
		String fruit="Tlt";
		String rev="";
		for(int i=fruit.length()-1;i>=0;i--)
		{
			rev=rev+fruit.charAt(i);
		}
 System.out.println(rev);
 if(fruit.equalsIgnoreCase(rev))
 {
	 System.out.println("it is a palindrome");
 }
 else
 {
	 System.out.println("not palindrome");
 }
	}

}
