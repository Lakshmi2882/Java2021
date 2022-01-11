package Naveen;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=15;
		boolean flag=false;
		if(num>2)
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}
		}
		}
		else
		{
			if (num==2)
			{
				flag=false;
			}
		}
		
		
		
if(flag==false) {
	System.out.println("prime number");
}
else
{
	System.out.println("not prime number");
}
	}

}
