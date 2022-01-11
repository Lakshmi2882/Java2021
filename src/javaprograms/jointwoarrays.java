package javaprograms;

public class jointwoarrays {

	public static void main(String[] args) {
		String Fname[]= {"Radhika","Swaraj","Bharadwaj"};
		String Lname[]= {"Eddanapudi","venkata","Eddanapudi"};
	
		for(int i=0;i<Fname.length;i++)
		{
		String	Fullname=Fname[i]+Lname[i];
		System.out.println(Fullname);
		}

	}

}
