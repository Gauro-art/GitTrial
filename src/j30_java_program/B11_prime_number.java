package j30_java_program;


public class B11_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int num=3;
		int count=0;		 
		
			
			for(int i=2;i<num;i++)
			{
				if (num%i==0);{
				count++;}
			}
			if(count>0) {
				System.out.println("not prime number");
			}
			else {
				
				System.out.println(" prime number");
			}
	}

}
