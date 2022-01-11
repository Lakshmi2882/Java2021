package popularjavaquestions;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int prev=0;
		for(int i=1;i<=20;i++)
		{
			
		int fib=num+prev;
		System.out.println(fib);
		prev=num;
		num=fib;
		}

	}

}
