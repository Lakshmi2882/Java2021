package javaprograms;

import java.net.MalformedURLException;
import java.net.URL;

public class compareURL {

	public static void main(String[] args) {
		try {
			System.out.println(new URL("https://www.tutorialspoint.com/").equals(new URL("https://93.184.220.42")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
