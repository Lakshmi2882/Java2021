package javaprograms;

import java.util.Arrays;

public class largestandsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-5,67,89,7890,45678};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else
			{
				smallest=arr[i];
			}
		}
		System.out.println("the given array is:"+Arrays.toString(arr));
		System.out.println(largest);
		System.out.println(smallest);
		

	}

}
