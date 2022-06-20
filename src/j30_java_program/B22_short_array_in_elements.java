package j30_java_program;

import java.util.Arrays;

public class B22_short_array_in_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,3,5};
		System.out.println("Array before sorting :"+Arrays.toString(a));

		int n=a.length;
		for(int i=0; i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		System.out.println("Array After sorting:"+Arrays.toString(a));
	}

}
