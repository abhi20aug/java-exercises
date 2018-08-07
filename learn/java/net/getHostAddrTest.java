package learn.java.net;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class getHostAddrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ina = InetAddress.getLocalHost();
			System.out.println(ina.getHostName());
			System.out.println(ina.getHostAddress());
			
			InetAddress ipaddre = InetAddress.getByName("www.google.com");
			System.out.println(ipaddre.getHostAddress());
			
			InetAddress hostname = InetAddress.getByName("192.168.56.1");
			System.out.println("host address: " +hostname.getHostName());
			
			//getlist of all IPs
			InetAddress[] allhosts = InetAddress.getAllByName("www.google.com");
			for (InetAddress host:allhosts)
			{
				System.out.println(host.getHostAddress());
			}
			System.out.println("Competed!");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		DESKTOP-HPGGP4M
//		192.168.56.1	
	}

}
