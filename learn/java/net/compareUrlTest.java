package learn.java.net;

import java.net.MalformedURLException;
import java.net.URL;

public class compareUrlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL google = new URL("http://www.google.com");
			URL bing = new URL("http://www.bing.com");

			if (google.equals(bing)) {
			} else {
				System.out.println("not equal");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
