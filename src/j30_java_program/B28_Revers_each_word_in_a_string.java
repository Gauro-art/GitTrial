package j30_java_program;

public class B28_Revers_each_word_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome To java";
		String[] words=str.split(" ");
		String reverseString="";
		for(String w:words) {
			String reverseword="";
			for (int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
		

	}

}
