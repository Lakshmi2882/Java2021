package javaprograms;

public class Howtomaximumorminimumunsortedarrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {85,90,34,67};
		int temp=0;
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
			}
			System.out.println(temp);
		}
	}

}
