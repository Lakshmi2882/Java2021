package octoberjavainterviewquestions;

import java.util.Arrays;

public class twonumbersinunsortedarray {

	public static void main(String[] args) {
	int num[]={2,3,4,3,2,3};
	duplicatenumbers(num);

}
	public static void duplicatenumbers(int num[])
	{
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{  int count=1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count=count+1;
				}
				else
					break;
			}
			if(count>1)
			{
				System.out.println(num[i]+":"+count);
				i+=(count-1);
			}
			else if(count==1)
			{
				System.out.println(num[i]+":"+count);
			}
		}
	}
}


