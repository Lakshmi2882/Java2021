package javaprograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5351;
		int num1=num;
		int rev=0;
		int remainder;
		for(int i=0;i<num;i++)
		{
		if(num>0)
		{
			remainder=num%10;//5//4
			rev=(rev*10)+remainder;//5//50+4
			num=num/10;//534
		}
		
		}
		System.out.println("reverse number is:"+rev);
		System.out.println("print:"+num1);
		if(num1==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	
	}

}
