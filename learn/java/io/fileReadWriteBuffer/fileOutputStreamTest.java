package learn.java.io.fileReadWriteBuffer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fos = 
			new FileOutputStream(
					"F:/java/eclipse-workspace/learn.java.io.fileReadWriteBuffer/src/out.txt"
					,true //true -> append, false-> replace
					); 
		String data = "fileoutputstream data write!";
		byte[] b = data.getBytes(); //convert into byte to pass it fos
		
		try {
			fos.write(b);
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
