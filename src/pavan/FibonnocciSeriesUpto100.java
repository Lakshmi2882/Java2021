package pavan;

public class FibonnocciSeriesUpto100 {

	public static void main(String[] args) {
		long Fn=0;
		long sec=1;
		System.out.println(Fn);
		System.out.println(sec);
		for(int i=2;i<=50;i++)
		{
			long fib= Fn+sec;
			System.out.println(fib);
			Fn=sec;
			sec=fib;
					
		}

	}

}
