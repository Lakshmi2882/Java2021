package octoberjavainterviewquestions;

import java.util.HashMap;

public class hashmappro {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "lakshmi");
		map.put(2, "radhika");
		map.put(1, "bbb");
		map.put(4, "la");
		map.put(null,"ll");
		map.put(null, "la");
		map.put(5,"lakshmi");
		System.out.println(map);

	}

}
