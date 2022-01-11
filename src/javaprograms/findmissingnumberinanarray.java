package javaprograms;

public class findmissingnumberinanarray {

	public static void main(String[] args) {
	int num[]= {1,2,3,4,6};
	System.out.println(missingnumber(num,6));
		
	}
public static int missingnumber(int num[],int n)
{
	int total=(n*(n+1))/2;
	int sum=0;
	for(int i:num)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	
	return total-sum;
}
}
