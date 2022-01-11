package javaprograms;

public class reverseaninteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		
	
		   while(num!=0)
		   {
			
			rev=rev*10+num%10;//5
			num=num/10;//1234
		
		}
 System.out.println(rev);
	}

}
