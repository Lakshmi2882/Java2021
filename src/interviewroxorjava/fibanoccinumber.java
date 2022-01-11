package interviewroxorjava;

public class fibanoccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int prev=0;
int fib=1;
 for(int i=1;i<=10;i++)
 { 
	 int sum=fib+prev;
	 prev=fib;
	  System.out.println(sum);
	  fib=sum;
	  
 }

	}

}
