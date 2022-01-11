package interviewroxorjava;

public class secondlargestinArray {

	public static void main(String[] args) {
		int[] a= {23,56,4,34,45};
		int max=0;
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])//0<23,23<56,56<4,56
			{ min=max;//0,23
				max=a[i];//23,56
			}
		}
		System.out.println(min);
		
		
	}
}


