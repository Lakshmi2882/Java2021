package octoberjavainterviewquestions;

public class pyramidpattern2 {

	public static void main(String[] args) {
		for(int i=0;i<=9;i=i+2)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
