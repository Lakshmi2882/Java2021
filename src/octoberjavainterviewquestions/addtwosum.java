package octoberjavainterviewquestions;

import java.util.Arrays;

public class addtwosum {

	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,5,9,8,7};
	Arrays.sort(arr);//1,2,3,4,5,5
	for(int i=0;i<arr.length-1;i++)
	{  
		for(int j=i+1;j<arr.length-1;j++)
	{
		int sum=arr[i]+arr[j+1];//1+2=3,1+3=4,1+4=5,1+5=6,1+5=6
		if(sum==9)
		{
			System.out.println(arr[i]+" "+arr[j+1]);
		}
	}
		
	}

}
}

