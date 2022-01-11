package popularjavaquestions;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-5;
		int count=0;
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count=count+1;
					
				}
			}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
			if(count>2 ||count<2)
			{
				System.out.println("not a prime number");
			}
		}
		else
		{
			System.out.println("not a positive integer , it must be either 0 or -ve");
		}

	}

}
