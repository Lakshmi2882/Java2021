package octoberjavainterviewquestions;

import java.lang.reflect.Array;

public class leaderelement {
	public static void main(String[] args)
	{
int [] a= {55,40,23,34,21,35};
int Max=(int) Array.get(a, a.length-1);
System.out.println(Max);
for(int i=a.length-2;i>=0;i--)
{
	if(a[i]>Max)
	{
		Max=a[i];
		System.out.println(Max);
	}
}

  
	}

}
