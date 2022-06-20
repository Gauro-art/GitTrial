package j30_java_program;

public class B24_remove_junk_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="%^^%$^%$ latin string 01234567890";

		s=s.replaceAll("[^a-zA-Z0-9]", "" );
		System.out.println(s);
	}

}
