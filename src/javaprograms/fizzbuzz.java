package javaprograms;

public class fizzbuzz {

	public static void main(String[] args) {
		int num=341;
		if(num%3==0&&num%5==0)
		{
			System.out.println("fizzbuzz");
		}
		else if(num%3==0)
		{
			System.out.println("fizz");
		}
		else
		{
			System.out.println("buzz");
		}

	}

}
