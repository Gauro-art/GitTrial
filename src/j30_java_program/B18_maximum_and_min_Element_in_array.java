package j30_java_program;

public class B18_maximum_and_min_Element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {50,30,40,20,60};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum lement is array is:"+max);
	}
	

}
