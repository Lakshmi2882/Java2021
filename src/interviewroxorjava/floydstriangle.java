package interviewroxorjava;

public class floydstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1;
		for(int i=1;i<=9;i++)//2<=9
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print(p +" ");
				p=p+1;
			}
			System.out.println();
		}

	}

}
