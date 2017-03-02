import java.util.*;

public class validate {
			
	public static int validate_email(String email){
		ArrayList<String> d = new ArrayList<String>();
		d.add("hotmail");
		d.add("gmail");
		d.add("yahoo");
		d.add("live");
		
		int errors=0;
		if(!email.contains("@")) errors++;
		if(!email.contains(".")) errors++;
		
		
		
		return errors;
	}
}
