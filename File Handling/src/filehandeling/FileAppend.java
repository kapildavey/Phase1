package filehandeling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
public static void main(String[] args) {
	String data ="This is appended..";
	try {
		FileWriter output = new FileWriter("data3.txt",true);
		output.write(data);
		System.out.println("Data appended successfully.");
		output.close();
	}catch (IOException ex) {
		System.out.println("File append error..");
	}
	
}
}
