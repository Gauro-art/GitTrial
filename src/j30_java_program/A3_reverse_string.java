package j30_java_program;

public class A3_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABCD";
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		
		}
		System.out.println("reverese sring is:"+rev);
	}

}
