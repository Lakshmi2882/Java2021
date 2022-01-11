package popularjavaquestions;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		int no;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		no=s.nextInt();
		if(no>0)
		{
		if(no%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		}
		else
		{
			System.out.println("it is either 0 or negetive number");
		}
		
	}

}
