package SoftTestingHelpPrograms;

public class secondHghestNumber {

	public static void main(String[] args) {
		int num[]= {20,29,23,34,12};
//		Arrays.sort(num);
//		System.out.println(num[num.length-2]);
		int max=num[0];
		int min=num[0];
		int secondlargest=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{ secondlargest=max;
				max=num[i];
			}
			else
			{
				if(num[i]<min)
				{
					min=num[i];
				}
			}
		}
System.out.println(max);

System.out.println(min);

	}

	
}
