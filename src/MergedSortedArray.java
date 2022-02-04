import java.util.Arrays;

public class MergedSortedArray {

	public static void main(String[] args) {
		int num1[]= {1,2,3,0,0,0};
		int num2[]= {2,3,4};
		int m=3;
		int n=3;
		for(int i=0;i<n;i++)
		{
			num1[i+m]=num2[i];//2,3,4
			
		}
		for(int i=0;i<num1.length;i++)
		{
			System.out.println(num1[i]);

		}
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	
	}

}
