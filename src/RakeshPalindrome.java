
public class RakeshPalindrome {

	public static void main(String[] args) {
		int num=123;
		int num1=num;
		int rev=0;
		while(num!=0)
		{
			int r=num%10;//3,2,1
			rev=rev*10+r;//3,32,321
			num=num/10;//12,1,0
			
		}
		if(rev==num1)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
