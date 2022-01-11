package octoberjavainterviewquestions;

public class missingnumbers {

	public static void main(String[] args) {
		int [] i= {1,2,3,5};
		int total=0;
		int numbtotal=0;
		for(int j=0;j<i.length;j++)
		{
			 total=total+i[j];
		}
System.out.println(total);
 for(int k=1;k<=5;k++)
 {
	 numbtotal=numbtotal+k;
 }
 System.out.println(numbtotal);
 int missingnum=numbtotal-total;
 System.out.println(missingnum);
	}

}
