package practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Eh{
	
	public void ehTh() throws FileNotFoundException {
		
		FileInputStream fi=new FileInputStream("d:/new.txt");
	}
}

public class EHThrow1{
	public static void main(String[] args) {
	Eh n=new Eh();
	try {
		n.ehTh();
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found");;
	}
	}
}