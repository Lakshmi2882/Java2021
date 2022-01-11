package octoberjavainterviewquestions;

import java.util.Arrays;

public class sortinganarray {

	public static void main(String[] args) {
	int a[]= {2,1,4,5,3};
	System.out.println("Print the array:"+Arrays.toString(a));
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
		if(a[j]>a[j+1])//2>1,1>4
		{
			int temp=a[j];//2,1
			a[j]=a[j+1];//1,  
			a[j+1]=temp;//2
		}
		
		}
		
	}
	System.out.println("Arrays after sorting:"+Arrays.toString(a));
	}

}
