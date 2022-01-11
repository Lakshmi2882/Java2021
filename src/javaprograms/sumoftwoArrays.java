package javaprograms;

public class sumoftwoArrays {

	public static void main(String[] args) {
		int num[]= {3,4,2,5,1};
		int target=5;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==target)
				{
					System.out.println(i+ " "+ j);
				}
			}
		}

	}

}
