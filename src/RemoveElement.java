public class RemoveElement {

	public static void main(String[] args) {
		int num[]= {3,2,2,3};
		int n=num.length;//4,3,
		int i=0;
		int val=3;
		while(i<n)
		{
			if(num[i]==val)
			{
			num[i]=num[n-1];//num[0]=3,num[0]=2,num[1]=2,num[2]=2,num[3]=3
			n--;//n=2
			}
			else
				i++;//1,2,3
		}
		System.out.println(n);
	}

}
