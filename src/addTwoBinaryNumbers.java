
public class addTwoBinaryNumbers {

	public static void main(String[] args) {
 System.out.println("value is: "+addBinary("0","0"));
}
	public static String addBinary(String a, String b)
	{
	int l1=a.length()-1;
	 int l2=b.length()-1;
	 System.out.println(l1);//2
	 System.out.println(l2);//1
	 int v1=0;
	 int v2=0;
	 if(a.contains("0")&&b.contains("0"))
	 {
		 return "0";
	 }
	 for(int i=0;i<a.length();i++)
	 {
		 v1=v1+(int)Math.pow(2,l1)*(a.charAt(i)-'0');//
		 l1=l1-1;
	 }
	 System.out.println(v1);
	 for(int i=0;i<b.length();i++)
	 {
		 v2=v2+(int)Math.pow(2,l2)*(b.charAt(i)-'0');//
		 l2=l2-1;
	 }
	 System.out.println(v2);
	 int v3=v1+v2;
	 System.out.println(v3);
	 String binary="";
	 while(v3!=0)
	 {
	 int r=v3%2;//
	  binary=binary+String.valueOf(r);
	  v3=v3/2;
	 }
	 String binary1="";
	 for(int i=binary.length()-1;i>=0;i--)
	 {
	binary1=binary1+binary.charAt(i);
	 }
	 return binary1;
}
}
