package j30_java_program;

public class B25_RemovingwhiteSpeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java programing seleniun automatoi";
		
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces  :"+str);
		

	}

}
