package j30_java_program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B29_Reading_data_from_Text_file {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("F:\\selenium imp.txt");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
			
		}

	}

}
