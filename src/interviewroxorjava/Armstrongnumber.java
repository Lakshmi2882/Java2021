package interviewroxorjava;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15345;
		int arm=0;
		while(num!=0)
		{
		int r=num%10;
		arm=arm+r*r*r;
		num=num/10;//15
		}
		System.out.println("armstrong number is:"+arm);
	

	}

}
