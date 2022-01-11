package javaprograms;

public class findnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2343433;
		int count =0;
		int r;
		int sum=0;
		while(num!=0)
		{
		if(num>0)
		{ count++;
			r=num%10;//4
			sum=(sum*10)+r;
			 num=num/10;//23
			
		}
		}
System.out.println(count);
	}
	
}
