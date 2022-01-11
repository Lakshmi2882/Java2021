package Naveen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	public static void main(String[] args) {
		String  path="C:\\Users\\eddan\\eclipse-workspace\\java\\src\\Naveen\\path";
		BufferedReader reader=null;
		int linescount=0;
		int wordcount=0;
		int charcount=0;
	
			try {
				reader=new BufferedReader(new FileReader(path));
				String currentline=reader.readLine();
				while(currentline!=null)
				{   if(!currentline.isBlank())
				{
					linescount=linescount+1;
					String[]words=currentline.split(" ");
	char[] character=currentline.toCharArray();
					wordcount=wordcount+words.length;
					charcount=charcount+character.length;
					
				}
				currentline=reader.readLine();
				}
			System.out.println(linescount);
			System.out.println(wordcount);
			System.out.println(charcount);
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

	}

}
