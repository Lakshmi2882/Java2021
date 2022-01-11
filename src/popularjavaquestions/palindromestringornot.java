package popularjavaquestions;

public class palindromestringornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="lakal";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
		if(name.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
