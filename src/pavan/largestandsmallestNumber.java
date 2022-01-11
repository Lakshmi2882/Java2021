package pavan;

public class largestandsmallestNumber {

	public static void main(String[] args) {
		int[] array= {77,120,30,40,50,68};
		int min=array[0];
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			else
				if(array[i]<min)
				{
					min=array[i];
				}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
