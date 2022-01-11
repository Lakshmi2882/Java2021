package pavan;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=154;
		int num1=num;
		int t=0;
		while(num!=0)
		{
			int r=num%10;
			t=t+r*r*r;
			num=num/10;
		}
		System.out.println(t);
		if(t==num1)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}

	}

}
