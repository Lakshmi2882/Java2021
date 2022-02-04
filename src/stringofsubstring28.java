
public class stringofsubstring28 {

	public static void main(String[] args) {
		String haystack="abc";
		String needle="c";
		int h=haystack.length();
	    int n=needle.length();
	        if(h>n)
	        { if(haystack.contains(needle))
	                System.out.println( n);
	            else
	                System.out.println(-1);
	        }
	           
	        else
	            if(h==n)
	            {
	                System.out.println(0);
	            }

	}

}
