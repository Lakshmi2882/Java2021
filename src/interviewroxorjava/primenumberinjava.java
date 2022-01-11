package interviewroxorjava;

public class primenumberinjava {

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
		}
		else
		{
			System.out.println("invalid");
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else if(count>2)
		{
			System.out.println("not a prime");
		}

	}

}
