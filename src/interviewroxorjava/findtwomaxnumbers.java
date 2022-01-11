package interviewroxorjava;

public class findtwomaxnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {23,23,21,24,32,32};
		int max1=0;
		int max2=0;
		for(int e:num)
		{
			if(max1<e)//0<23,23<23,23<21,23<24,24<32,32<32
			{
				max2=max1;//0,23,24
				max1=e;//23,24,32
				
			}
			else if(max2<e)//0<23,23<21,23<32
			{
				max2=e;//23,32
			}
		}
System.out.println(max1);
System.out.println(max2);
	}

}
