package javaprograms;

public class primenum {

	public static void main(String[] args) {
		System.out.println(isPrime(13));
	}
	public static boolean isPrime(int num)
	{
		if((num==0)&&(num==1))
		{
			return false;
		}
		if(num==2)
		{
			return true;
		}
		
			for(int i=2;i<num;i++)
			{
				if((num%i==0))
				{
					return false;
				}
			}
			
		
		return true;
	}
}
