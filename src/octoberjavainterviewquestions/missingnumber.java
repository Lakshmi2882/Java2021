package octoberjavainterviewquestions;

public class missingnumber {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		int n=10;
		int sum=0;
		int total=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i] ;
		}
System.out.println(sum);
total=(n*(n+1))/2;
System.out.println(total-sum);
	}

}
