package octoberjavainterviewquestions;

public class staticandnonstatic {
 static int  count=0;//class variable
 int i=0;
	public static void main(String[] args) {
		int s=count+1;
		System.out.println(s);
		staticandnonstatic obj=new staticandnonstatic();
		System.out.println(obj.i);
		
	}
	
}
