package octoberjavainterviewquestions;

public class isnumberbinary {

	public static void main(String[] args) {
	
isBinary(0);
	}
	public static void isBinary(int num)
	{   boolean binary=true;
		while(num!=0)
		{
			int rem=num%10;
			if(rem>1)
			{
			 binary=false;
			 break;
			}
			else
			{
				num=num/10;
			}
		}
		if(binary)
		{
			System.out.println("it is a binary number");
		}
		else
		{
			System.out.println("not");
		}
	}

}
