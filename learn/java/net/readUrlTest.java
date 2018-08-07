package learn.java.net;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.*;

public class readUrlTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://github.com/abhi20aug/");
			InputStream is = url.openStream();
			byte[] b = new byte[80];
			
			while (is.read(b) != -1)
			{
				System.out.println(new String(b));
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}

}
