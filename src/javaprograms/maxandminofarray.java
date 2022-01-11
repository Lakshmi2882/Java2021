package javaprograms;

public class maxandminofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,-10,34,56,-100,78};
		int maximum=arr[0];//23
		int minimum=arr[0];//23
		for(int i=1;i<arr.length;i++)
		{
			if(maximum<=arr[i])//23<=45,45<=-10,45<=34,45<=56
			{
				maximum=arr[i];//45
			}
			else if(minimum>arr[i])
			{
				minimum=arr[i];//-10,34
			}
		}
		System.out.println(maximum);
		System.out.println(minimum);

	}

}
