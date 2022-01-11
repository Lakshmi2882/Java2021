package javaprograms;

import java.util.Arrays;

public class encryptedpassword {

	public static void main(String[] args) {
		String pwd="Lakshmi82RADHIKA";
		char c[]=new char[] {'L','a','k','s','h','m','i','8','2','R','A','D','H','I','K','A'};
		Arrays.fill(c,'*');
for(int i=0;i<c.length;i++)
{
	System.out.print(c[i]);
}
	}

}
