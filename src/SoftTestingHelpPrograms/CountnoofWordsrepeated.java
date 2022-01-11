package SoftTestingHelpPrograms;

import java.util.HashMap;

public class CountnoofWordsrepeated {

	public static void main(String[] args) {
		String sentence="I am going to go to movie to";
	String[] words=	sentence.split(" ");
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<words.length;i++)
	{
		if(!map.containsKey(words[i]))
		{
			map.put(words[i], 1);
		}
		else
		{
			map.put(words[i],map.get(words[i])+1);
		}
	}
	for(String e:map.keySet())
	{
		System.out.println(e +":"+ map.get(e));
	}
	}

}
