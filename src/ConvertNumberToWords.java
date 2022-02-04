import java.util.Scanner;

public class ConvertNumberToWords {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number: ");
	int n=	in.nextInt();//789
	int units=n%10;//9
	int tt=n/10;//78
	int tens=tt%10;//8
	int Hundred=n/100;//7
	String[]un= {"","","one","two","three","four","five","six","seven","eight","nine","ten","eleven","thirteen","fourteen"
			,"fifteen","sixteen","seventeen","eighteen","ninteen"};
	String[] te= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	String hu="hundred";
	
			
	if(n==0)
	{
		System.out.println("Zero");
	}
	if(n<20)
	{
		System.out.println(un[n]);
	}
	else if(n<100&&n>=20)
	{
		System.out.println(te[tens]+" "+un[units]);
	}
	else if(n>=100&&n<1000)
	{
		System.out.println(un[Hundred]+" "+hu+" "+te[tens]+" "+un[units]);
	}

	}

}
