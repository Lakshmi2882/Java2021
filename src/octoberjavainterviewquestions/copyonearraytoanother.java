package octoberjavainterviewquestions;

import java.util.Arrays;

public class copyonearraytoanother {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
	int b[]=Arrays.copyOf(a, a.length);

	System.out.print(Arrays.toString(b));
	int c[]= {};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<=i;j++)
			{
				c[j]=c[j]+a[i];
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
