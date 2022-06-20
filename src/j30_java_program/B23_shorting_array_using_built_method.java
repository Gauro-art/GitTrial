package j30_java_program;

import java.util.Arrays;

public class B23_shorting_array_using_built_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,60,40,30,};
		
		System.out.println("Array elements before sorting"+Arrays.toString(a));
Arrays.parallelSort(a);
		//Arrays.sort(a);
		System.out.println("Array elements After sorting"+Arrays.toString(a));
	}

}
