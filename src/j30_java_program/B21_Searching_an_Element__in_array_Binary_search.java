package j30_java_program;

public class B21_Searching_an_Element__in_array_Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		boolean flag=false;
		
		int key=5;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int m=(1+h)/2;
			
			if(a[m]==key) {
				
				System.out.println("element found..");
				flag=true;
				break;
				
			}
			if (a[m]==key) {
				
				l=m+1;
			}
			if(a[m]<key) {
				
				h=m-1;
				
			}
			
			
		}

		if(flag==false)
		{
			System.out.println("element not found..");
			
		}
	}

}
