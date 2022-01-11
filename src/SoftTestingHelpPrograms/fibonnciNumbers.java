package SoftTestingHelpPrograms;

public class fibonnciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8
		int num=0;
		int prev=1;
		System.out.println(num);
		System.out.println(prev);
		for(int i=0;i<=6;i++)
		{
			int fib=num+prev;
			System.out.println(fib);
			num=prev;
			prev=fib;
			
		}
	

	}

}
