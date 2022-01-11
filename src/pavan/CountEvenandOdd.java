package pavan;

public class CountEvenandOdd {

	public static void main(String[] args) {
		int num=1230;
		int value=0;
		int e=0;
		int o=0;
		
		while(num!=0)
		{ value=num%10;
			if(value%2==0)
			{
				e=e+1;
			}
			else
			if(value%2!=0)
			{
				o=o+1;
			}
			
			
			num=num/10;
		}
		System.out.println("even numbers are: " +e);
		System.out.println("odd numbers are: "+o);
		

	}

}
