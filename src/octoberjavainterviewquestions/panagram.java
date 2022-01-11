package octoberjavainterviewquestions;

public class panagram {

	public static void main(String[] args) {
		String sentence="the quic brown fox jumps over the lazy dog";
		
		if(sentence.matches("(.*[a-z]*)"))
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not a panagram");
		}
		}

	}


