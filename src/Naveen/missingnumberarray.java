package Naveen;

public class missingnumberarray {

	public static void main(String[] args) {
		int num[]= {1};
		int total=0;
	
		for(int i=0;i<num.length;i++)
		{ total=total+num[i];
		}
System.out.println(total);
int totalnum=0;
 for(int j=1;j<=2;j++)
 {
	 totalnum=totalnum+j;
 }
 System.out.println(totalnum-total);

	}

}
