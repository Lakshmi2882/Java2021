package octoberjavainterviewquestions;

public class removeduplicate {

	public static void main(String[] args) {
		int num[]= {1,1,2,2,5,4,4};
		System.out.println(num.length);
		for(int i=0;i<num.length;i++)
		{ int count=1;
			for(int k=i+1;k<num.length;k++)//
			{
				if(num[i]==num[k])
				{
					count=count+1;
				}
				else
				{
					break;
				}
			}
			if(count==1)
			{
				System.out.print(num[i]+" ");
			}
		}
		
	}

}
