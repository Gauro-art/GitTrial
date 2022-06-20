package j30_java_program;

import java.util.Scanner;

public class A5_palendrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		String str=sc.next();
	String	org_str=str;
		String rev="";
		
		int len=str.length();
		
		for (int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		if(org_str.equals(rev)) {
			
			System.out.println(org_str+  "  is palendrome string");
			}
		
		else {
			System.out.println(org_str+ "   is not palindrome string");
			
		}
		}
		
		
	}


