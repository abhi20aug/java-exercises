package learn.java.net;
import java.net.URL;
import java.net.MalformedURLException;

public class simpleUrlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myUrl = "http://github.com/abhi20aug";
		try {
			URL newUrl = new URL(myUrl);
			System.out.println("simple url"+newUrl.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
