package j30_java_program;

import java.util.Random;

public class B12_random_numbers_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		
		int rand_int=rand.nextInt(2000);
		System.out.println(rand_int);

	}

}


/*random string printing
	
	we need to download driver for that
	which is apache commons lang api
	http://commons.apache.org/
	download binary jar file
	
	
	
	

//String ranStr=RandomStringUtils.randomAlphabetic(5);

//System.out.println(ranStr);
}
*/