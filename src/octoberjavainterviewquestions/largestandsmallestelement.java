package octoberjavainterviewquestions;

public class largestandsmallestelement {

	public static void main(String[] args) {
		int num[]= {20,25,30,12,35};
		int max=num[0];//20
		int min=num[0];//25
	for(int i=1;i<num.length;i++)
	{
		if(num[i]>max)//25>20,30>25,12>30,35>30
		{
			max=num[i];//25,30,35
			}
		else
		{
			if(num[i]<min)//12<20
			{
				min=num[i];//12
			}
		}
	}
System.out.println("maximum is:"+max);
System.out.println("minimun is :"+min);
	}

}
