package learn.java.net;
import java.net.MalformedURLException;
import java.net.URL;

public class newURLConstructTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String protocol = "https";
		String host = "github.com";
		//int port = 80;
		String path = "/abhi20aug/";
		try {
			URL constrctedURL = new URL(protocol,host /*,port*/,path);
			System.out.println(constrctedURL.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
