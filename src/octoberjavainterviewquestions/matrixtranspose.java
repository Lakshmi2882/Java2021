package octoberjavainterviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class matrixtranspose {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int columns=sc.nextInt();
		int matrix[][]=new int [rows][columns];
		int transpose[][]=new int[columns][rows];
		System.out.println("Enter the data for Matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=sc.nextInt();//get the data from user
			}
		}
		System.out.println("print the data");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("print transpose matrix");
for(int i=0;i<rows;i++)
{
	for(int j=0;j<columns;j++)
	{
		transpose[j][i]=matrix[i][j];
	}
}
System.out.println("To get the data in the form of Array");
for(int[] r:transpose)
{
	System.out.println(Arrays.toString(r));
}
	}

}
