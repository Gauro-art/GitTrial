package j30_java_program;

public class B14_sum_of_elements_in_arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,6,6};
		
		int sum=0;
		
		for(int i=0; i<=a.length-1;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		/*
		 * 
		 //enhanced for loop
		int sum=0;
		for(int value:a){
		
		sum=sum+value;}
		
		
		*/



	}

}
