package j30_java_program;

import java.util.Arrays;

public class B16_2Arrays_are_equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[]= {2,4,5,5};
		int a2[]= {2,4,5,6};
		
		boolean status=Arrays.equals(a1,a2);
		
		if(status==true) {
			System.out.println("arrays are equal");
			
		}
		else
		{
			System.out.println("arrays are not equal");
			
		}
		
		
		
	

	}
}
