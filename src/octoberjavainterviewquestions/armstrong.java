package octoberjavainterviewquestions;

public class armstrong {

	public static void main(String[] args) {
int num=9474;
int num1=num;
int arm=0;
int r=0;
while(num>0)
{
	r=num%10;
	arm=r*r*r+arm;
	num=num/10;
}
if(num1==arm)
{
	System.out.println("armstrong number");
}
else
{
	System.out.println("not an armstrong number");
}
	}

}
