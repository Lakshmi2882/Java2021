package javaprograms;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int r;
int arm=0;
while(num>0)
{
	r=num%10;
	arm=arm+r*r*r;
	num=num/10;
}
System.out.println("number is"+arm);
	}

}
