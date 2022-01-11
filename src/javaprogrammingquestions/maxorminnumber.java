package javaprogrammingquestions;

public class maxorminnumber {

	public static void main(String[] args) {
	int num[]= {23,456,56,45,34,576,0};
	int max=num[0];
	int min=num[0];
for(int i=1;i<num.length;i++)
{
	if(num[i]>=max)//456>=23,456>=56
	{
		max=num[i];//456
	}
	else
	{
		if(num[i]<=min)//56<=23
		{
			min=num[i];
		}
	}
}
System.out.println("maximum number is :"+max);
System.out.println("minimum number is :"+min);
	}

}
