package Naveen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class countMaxwordfromPath {

	public static void main(String[] args) {
		String  path="C:\\Users\\eddan\\eclipse-workspace\\java\\src\\Naveen\\path";
		Map<String,Integer> wordMap=new HashMap<String,Integer>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(path));//to get the path
			String currentLine=reader.readLine();//to go to currentline in the file
			while(currentLine!=null)
			{
		String[] words=	currentLine.toLowerCase().split(" ");
		for(String word:words)
		{ if(!word.isBlank())
		{
			if(!wordMap.containsKey(word))
			{
				wordMap.put(word, 1);
			}
			else
			{
				wordMap.put(word, wordMap.get(word)+1);
			}
		}
		}currentLine=reader.readLine();
		}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		wordMap.forEach((k,v)->System.out.println(k+":"+v));
		HashMap<String,Integer> count=new HashMap<String,Integer>();
		count.entrySet().stream().filter(entry->entry.getValue()==Collections.max(wordMap.values()))
		.forEach(e->count.put(e.getKey(),e.getValue()));
		System.out.println(".........");
		System.out.println(count);

	}

}
