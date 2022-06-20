package j30_java_program;

public class A7_odd_even {

	public static void main(String[] args) {
//calculate the odd and even no of the numbers
		int num=1234;
		
		int even_cont=0;
		int odd_cont=0;
		
		while(num>0) {
			
			int rem=num%10;
			if(rem%2==0) {
				even_cont++;
				
			}
			else {
				
				odd_cont++;
			}
			num=num/10;
		}

		System.out.println("number of even numbers:"+even_cont);
		System.out.println("number of odd numbers"+odd_cont);
	}

}
