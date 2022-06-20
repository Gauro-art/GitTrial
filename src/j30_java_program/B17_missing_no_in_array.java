package j30_java_program;

public class B17_missing_no_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5};
		
		int sum=0;
		for (int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println("sum of elements in array:"+sum);
		int sum1=0;
		
		for(int i=1;i<=5;i++) {
			
			sum1=sum1+i;
		}
		System.out.println("sum of elements in array:"+sum1);
		System.out.println("missing number is:"+(sum1-sum));
	}

}
