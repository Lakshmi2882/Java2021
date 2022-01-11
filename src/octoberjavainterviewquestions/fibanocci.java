package octoberjavainterviewquestions;

public class fibanocci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13
		int fib=1;
		
		int total;
		int prev=0;
		for(int i=0;i<=10;i++)
		{ 
		total=fib+prev;
		prev=fib;
		System.out.println(total);
		fib=total;
		
			
			
		}
		

	}

}
