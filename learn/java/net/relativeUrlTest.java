package learn.java.net;

import java.net.MalformedURLException;
import java.net.URL;

public class relativeUrlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL main = new URL("http://github.com");
			URL relative = new URL(main,"/abhi20aug/");
			
			System.out.println(main.toString());
			System.out.println(relative.toString());
				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
