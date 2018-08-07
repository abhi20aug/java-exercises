package learn.java.net;
import java.net.MalformedURLException;
import java.net.URL;

public class fileUrlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL fileURL = new URL("file://F:/java/eclipse-workspace/codeComponents/src/abc.txt");
			System.out.println(fileURL.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
