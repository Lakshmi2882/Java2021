package Naveen;

public class ConverttwoArrays {

	public static void main(String[] args) {
		int[][]num= {{3,4,5},{4,5,6,4}};
		System.out.println(num.length);
		int sum=0;
		int k=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.println(num[i][j]);
				sum=sum+(int)Math.pow(10, k)*num[i][j];
				k++;
			}
			System.out.println(sum);
			
		}
		
		

	}

}
