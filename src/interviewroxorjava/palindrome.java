package interviewroxorjava;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=125;
int num1=num;
int rev=0;
while(num>0)
{
	rev=rev*10+num%10;
	num=num/10;
}
System.out.println(rev);
System.out.println(num);

if(num1==rev)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
	}

}
