package j30_java_program;

public class B13_factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		
		long factorial=1;
		
		for (int i=1; i<=num;i++)
		{
			
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		
	}

}
