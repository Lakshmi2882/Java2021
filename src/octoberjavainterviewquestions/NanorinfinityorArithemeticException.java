package octoberjavainterviewquestions;

public class NanorinfinityorArithemeticException {

	public static void main(String[] args) {
		//System.out.println(9/0); Arithemetic exception
		System.out.println(9.0/0);//infinity
		System.out.println(9.0/0.0);//infinity
		System.out.println(18.5f/0);//infinity
		System.out.println(18.5f/0.0);//infinity
		System.out.println(17.555d/0);//infinity
		System.out.println(17.34d/0.0);//infinity
		System.out.println(0.0/0);//NaN
		System.out.println(0.0/0.0);//NaN
	}

}
