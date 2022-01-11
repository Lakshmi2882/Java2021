package javaprograms;

public class fibanocci {

	public static void main(String[] args) {
		int fib=1;
		int total;
		int prev=0;
		System.out.println(fib);
		for(int i=1;i<=10;i++)
		{
		total=fib+prev;
	System.out.println(total);
	prev=fib;
		fib=total;
	}

}
}
