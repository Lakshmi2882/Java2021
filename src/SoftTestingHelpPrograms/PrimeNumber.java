package SoftTestingHelpPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=0;
		boolean flag=false;
		  
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=true;
				}
			}
		  
		 
		if(flag==false)
		{
			System.out.println("num is prime");
		}
		else
		{
			System.out.println("num is not prime");
		}

	}
	

}
