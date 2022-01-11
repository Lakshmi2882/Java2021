package javaprograms;

public class fibonaccinumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,1,2,3,5,8
		int num=1;
		int prev=0;
		System.out.println(num);
		for(int i=0;i<=10;i++)
		{
			int newnumber=num+prev;//1,2,3
			prev=num;//1,1,2
			System.out.println(newnumber);//1,2,3
		num=newnumber;//1,2
			
		}

	}

}
