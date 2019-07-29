package learn.multiThreading.synchronizer;

class Display{

	public void wish(String name) {

		for (int i =0; i< 10; i++)
		{
			System.out.println("Good Morning:"+i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			System.out.println(name);
		}
	
}
}

class newThread extends Thread{

	Display d;
	String name;

	public newThread(Display d, String name) {
		this.d =d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
	

}


public class nonSynchronizedMethodDemo {
	public static void main(String[] args) {
	
		//new thread should create a new thread with some object as well.
		//since each new thread should pass same object and diff name?

		Display d = new Display();
		newThread nt = new newThread(d,"Dhoni");
		newThread nt2 = new newThread(d,"Virat");

		nt.start();
		nt2.start();
	
	}

}
