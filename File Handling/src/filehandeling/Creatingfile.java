package filehandeling;

import java.io.File;
import java.io.IOException;

public class Creatingfile {
public static void main(String[] args) {
	File myfile =new File("data3.txt");
	try {
	if(myfile.createNewFile()) {
		System.out.println("File created successfully");
	}
	else {
		System.out.println("File creation error");
	}
		
}catch (IOException ex) {
	System.out.println(" File error...");
}
}
}