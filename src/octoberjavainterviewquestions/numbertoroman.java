package octoberjavainterviewquestions;

public class numbertoroman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(roman(1234));
	}
 public static String roman(int x)
 {
	 String[] units=new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	 String[] tens=new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	 String[] hundred=new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	 String[] Thousand=new String[] {"","M","MM","MMM"};
	 
	 
		return Thousand[x/1000]+hundred[(x%1000)/100]+tens[(x%100)/10]+units[x%10];
		 
	 
 }
}
