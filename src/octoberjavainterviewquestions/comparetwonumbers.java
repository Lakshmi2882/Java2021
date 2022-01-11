package octoberjavainterviewquestions;

public class comparetwonumbers {

	public static void main(String[] args) {
	Integer num1=-128;//num1,num2 are object references
	Integer num2=-128;
	//Integer Caching range -128 to 127
	if(num1==num2)
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println("not equal");
	}
	
	int n1=100;
	int n2=100;
	if(n1==n2)
	{
		System.out.println("e");
	}
	else
	{
		System.out.println("v");
	}

}
}
