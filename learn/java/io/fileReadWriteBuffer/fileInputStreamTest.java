		//read data from text file to java application
			//FileInputStream
		//write data from text file	
			//FileOutputStream
		//binary large object , 
		
		// stream -> medium to flow data from input/output devices
		// byte, oriented class name ends with stream
		//char oriented class name ends with Reader
		// fileinput, fileoutput 
		// 
		//data is availale in db, want to extract data into file html. 

package learn.java.io.fileReadWriteBuffer;

import java.io.FileInputStream;

public class fileInputStreamTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F:/java/eclipse-workspace/learn.java.io.fileReadWriteBuffer/src/abc.txt");
			int size = fis.available(); //datasize
			byte[] b = new byte[size];
			fis.read(b); //reads data upto byte array length and return bytearray into b
			String data = new String(b);
			fis.close();
			System.out.println("size: "+size);
			System.out.println(data);
			
		} catch (Exception fileException) {
			// TODO Auto-generated catch block
			System.out.println("error");
			fileException.printStackTrace();
		}
	}

}
