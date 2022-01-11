package javaprograms;

public class removeduplicateelementsfromanarray {

	public static void main(String[] args) {
		int num[]= {2,2,3,3,3,4,4,4,6,6,7};
		System.out.println(num.length);
	for(int i=0;i<num.length-1;i++)
	{
		if(num[i]!=num[i+1])
		{
			System.out.println(num[i]);
		}
	}
	}
		

	}


