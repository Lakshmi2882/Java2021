package Naveen;

import java.util.Arrays;

public class InsertElementinSpecificPosition {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50,60};
		System.out.println(arr.length);
		int newposition=2;
		int value=28;
		
		for(int i=arr.length-1;i>newposition;i--)
		{  
			arr[i]=arr[i-1];//50
		
		}
		arr[newposition]=value;
		System.out.println(Arrays.toString(arr));

	}

}