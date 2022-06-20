package j30_java_program;

public class B20_linearSearch_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40};
		
		int search_ele=40;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			
			if(search_ele==a[i]) {
				
				System.err.println("element found at:"+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			
			System.out.println("element not found");
		}
	}

}
