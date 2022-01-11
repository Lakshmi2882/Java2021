package Naveen;

public class ConvertArraytoInteger {

	public static void main(String[] args) {
		int[] num1= {4,4,5};
	System.out.println(	num1.length);
					int sum=0;
		int j=0;
 for(int i=num1.length-1;i>=0;i--)
 { 
 sum=sum+(int)Math.pow(10, j)*num1[i];
	 j++;
}
System.out.println(sum);
}
}
