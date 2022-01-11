package octoberjavainterviewquestions;

public class findmaximumandminimumarray {

	public static void main(String[] args) {
		int[] a= {2,4,23,3,32,1,43};
		int max=a[0];//2
		int min=a[0];//2
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])//2<4,4<23
			{
				max=a[i];//4,23
			}
			else
			{
				if(min>a[i])//2>4
				{
					min=a[i];
				}
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
