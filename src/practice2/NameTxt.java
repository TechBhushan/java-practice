package practice2;

import java.io.FileOutputStream;
import java.io.IOException;

public class NameTxt {

	public static void main(String[] args) throws IOException {
		
		int i;
		FileOutputStream fout = new FileOutputStream("D://name.txt");
		String s="TATA";
		
		char ch[]=s.toCharArray();
		
		for(i=0; i<s.length();i++)
			fout.write(ch[i]);
		fout.close();
		
	}
}