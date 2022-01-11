package octoberjavainterviewquestions;

import java.util.Arrays;

public class removeduplicateelements {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,2,3};
	
		int l=num.length;
		System.out.println(l);
		Arrays.sort(num);
		
		int j=0;
		for(int i=0;i<l-1;i++)
		{
			if(num[i]!=num[i+1])
			{
			num[j]=num[i];
			j++;
			}
		}
		num[j]=num[l-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(num[k]);
		}
	}
	
}
