package j30_java_program;

import java.util.Scanner;

public class A2_Revers_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		
		}
		System.out.println("reverse nuber is :"+rev);
	}

}
