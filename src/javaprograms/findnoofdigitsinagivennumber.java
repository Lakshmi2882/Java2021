package javaprograms;

public class findnoofdigitsinagivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=5;
 int count=0;
 int total=0;
 if(num==0)
 {
	 System.out.println("1");
 }
 else if(num<0)
 {
	 System.out.println("negetive number");
 }
 else
	 {if(num>0)
 while(num>0)
 {
	 total=total*10+num%10;
	 num=num/10;
	 count=count+1;
 }
	 }
 
 System.out.println(count);
	}

}
