package learn.multiThreading.synchronizer;

class baDisplay{

	public void wish(String name) {

		System.out.println("Non synchronized code run:");
		//any lines of code
		synchronized (this) {
			for (int i =0; i< 3; i++)
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
		//any lines of code	
		System.out.println("Non synchronized code run2:");

	}
}

class banewThread extends Thread{

	baDisplay d;
	String name;

	public banewThread(baDisplay d, String name) {
		this.d =d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
	

}


public class SynchronizedBlockDemo {
	public static void main(String[] args) {
	
		//new thread should create a new thread with some object as well.
		//since each new thread should pass same object and diff name?

		baDisplay d = new baDisplay();
		banewThread nt  =  new banewThread(d,"Dhoni");
		banewThread nt2 =  new banewThread(d,"Virat");

		nt.start();
		nt2.start();
	
	}

}
