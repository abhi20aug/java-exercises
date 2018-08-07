package learn.java.net;

import java.net.URL;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;

public class urlEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//encoder
			System.out.println(URLEncoder.encode("string with space","UTF-8"));
			System.out.println(URLEncoder.encode("string with char %^$^!@#","UTF-8"));
			
			//decoder
			System.out.println(URLDecoder.decode("string+with+char+%25%5E%24%5E%21%40%23","UTF-8"));

		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
