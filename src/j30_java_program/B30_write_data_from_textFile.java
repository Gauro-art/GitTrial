package j30_java_program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class B30_write_data_from_textFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("F:\\java programs ytub lectures 30\\Test123.txt");

		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("selenium with java");
		bw.write("selenium with python");
		
		System.out.println("finished!!!!");
		bw.close();
		
	}

}
