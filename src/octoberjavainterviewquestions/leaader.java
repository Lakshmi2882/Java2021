package octoberjavainterviewquestions;

import java.lang.reflect.Array;

public class leaader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,4,3,2,1};
	int max=Array.getInt(num, num.length-1);
	System.out.println(max);
	for(int i=num.length-2;i>=0;i--)
	{
		if(num[i]>max)
		{
			max=num[i];
			System.out.println(max);
		}
	}


	}

}
