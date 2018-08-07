package learn.java.io.fileReadWriteBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class bufferedReaderTest {

	public static void main(String[] args) throws IOException {
			
		InputStream input = System.in; //takes input in char-and keep in bytes
		InputStreamReader is = new InputStreamReader(input); //convert into char sting
		BufferedReader br = new BufferedReader(is); //convert into string
		System.out.println("Enter Text Data");
		String fdata = br.readLine(); //readString Data
		System.out.println(fdata);

		System.out.println("Enter Other Text Data");
		int odata = br.read(); //readString Data and provide ascii value
		System.out.println(odata+"   "+(char)odata);
		
		//addition
		System.out.println("Enter First No");
		String fn = br.readLine(); //readString Data
		System.out.println(fdata);
		
		System.out.println("Enter 2nd No");
		String sn = br.readLine(); //readString Data
		int fin =Integer.parseInt(fn);
    	int sin =Integer.parseInt(sn);

		System.out.println("Addition"+(fin+sin));

	
	}

}
