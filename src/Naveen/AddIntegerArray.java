package Naveen;

public class AddIntegerArray {

	public static void main(String[] args) {
		int[]num= {6,2,3,4};
		int total=0;
		
		for(int i=0;i<num.length;i++)
		{
			total=total+num[i];
		}
System.out.println(total);//15
total=15;


while(total>0)
{
int  r=total%10;
 System.out.println(r);
total=total/10;
}

}
	}


