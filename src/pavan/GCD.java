package pavan;

public class GCD {

	public static void main(String[] args) {
		int x=54;
		int y=20;
		int z=0;
		//54%24=6
		//24%6=0//6
		while(y!=0)
		{
			
		z=x%y;//34%24=10,24%10=4,10%4=2,4%2=0
			x=y;//x=24,x=10,x=4
			if(z!=0)
			{
				y=z;//y=10,y=4,y=2	
			}
			else
			{
				break;
			}
		
		}
		
		System.out.println(y);
		
		}
		

}

