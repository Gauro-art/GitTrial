package j30_java_program;

public class B15_Even_and_odd_numbers_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5,6,6,3,2};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("evern numbers   "+a[i]);
			}
		}
		for (int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) {
				
				System.out.println("odd numbers  "+a[i]);
			}
		}
		}
	}


