package javaprogrammingquestions;

public class numberpalindrome {

	public static void main(String[] args) {
		int num=131;
		int num2=num;
		int rev=0;
		while(num!=0)
		{
		int	r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
System.out.println(rev);
System.out.println("number is" +num2);
	
	if(num2==rev)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}

}
