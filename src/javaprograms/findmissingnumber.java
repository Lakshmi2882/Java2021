package javaprograms;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num[]= {1,2,4,5};
   int miss=0;
   int sum=0;
   
   for(int i=0;i<num.length;i++)
   {
	    sum=sum+num[i];
   }
   System.out.println(sum);
   int sum1=0;
   for(int j=1;j<=5;j++)
   {
	   sum1=sum1+j;
   }
   System.out.println(sum1);
   miss=sum1-sum;
	System.out.println(miss);

	}
	
}
