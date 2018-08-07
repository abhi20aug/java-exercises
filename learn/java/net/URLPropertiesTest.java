package learn.java.net;
import java.net.MalformedURLException;
import java.net.URL;

public class URLPropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strUrl = "http://www.java2novice.com:80/java_constructor_examples/?query=ok#header";
		try {
			URL url = new URL(strUrl);
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Port: "+url.getPort());
			System.out.println("Host: "+url.getHost());
			System.out.println("file: "+url.getFile());
			System.out.println("query: "+url.getQuery());
			System.out.println("authentication:"+url.getAuthority());
			System.out.println("refernece:"+ url.getRef());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
