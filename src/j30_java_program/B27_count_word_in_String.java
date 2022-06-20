package j30_java_program;

import java.util.Scanner;

public class B27_count_word_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	int	count=1;

		for(int i=0;i<s.length()-1;i++) {
			
		
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
	{	
			count++;
	}
		}

		System.out.println("number of words in a string :"+count);

	}
}
