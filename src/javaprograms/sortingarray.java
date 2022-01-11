package javaprograms;

public class sortingarray {

	public static void main(String[] args) {
		int arr[]= {5,6,8,9};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];//
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
