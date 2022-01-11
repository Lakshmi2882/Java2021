package interviewroxorjava;

public class palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reversenumber:"+rev);
		if(num==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
