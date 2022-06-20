package j30_java_program;

public class B19_dublicate_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"java","c","c++","python","java"};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
		if(arr[i]==arr[j]) {
			System.out.println("found duplicate element:"+arr[i]);
		}	
			}
		}
	}
	

}
