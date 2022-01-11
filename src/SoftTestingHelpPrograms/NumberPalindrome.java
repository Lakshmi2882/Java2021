package SoftTestingHelpPrograms;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=1232;
		int new1=num;
		int rev=0;
		while(num!=0)
		{  int mod=num%10;
		rev=rev*10+mod;
		num=num/10;
			
		}
		System.out.println(rev);
		if(new1==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
