public class validate {
	public static int validate_email(String email){
		int errors=0;
		if(!email.contains("@")) errors++;
		if(!email.contains(".")) errors++;
		return errors;
	}
}
