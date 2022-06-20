package j30_java_program;

public class B26_count_character_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java programing java oops";
		
		int totalcount=s.length();
		
		int totalcount_afterRemove=s.replace("a", "").length();
		int count=totalcount-totalcount_afterRemove;
		System.out.println("number occurances of a is :"+count);
		

	}

}
