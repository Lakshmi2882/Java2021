package javaprograms;

public class largestandsmallestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int number[]= {10,20,30,40};
 int largest=number[0];
 int smallest=number[0];
 for(int i=1;i<number.length;i++)
 {
	 if(number[i]>largest)
	 {
		 largest=number[i];
	 }
	 else
	 {
		 smallest=number[i];
	 }
	 
 }
 System.out.println(largest);
 System.out.println(smallest);
	}

}
