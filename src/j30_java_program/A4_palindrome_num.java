package j30_java_program;

import java.util.Scanner;

public class A4_palindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int ornum=num;
		
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(ornum==rev) {
			System.out.println(ornum+"palendrome number");
			
			
		}
		else {
			System.out.println(ornum+" not palindrome number");
		}


	}

}
