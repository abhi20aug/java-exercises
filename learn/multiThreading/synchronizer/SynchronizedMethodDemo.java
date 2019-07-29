package learn.multiThreading.synchronizer;

class aDisplay{

	public synchronized void wish(String name) {

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
}

class anewThread extends Thread{

	aDisplay d;
	String name;

	public anewThread(aDisplay d, String name) {
		this.d =d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
	

}


public class SynchronizedMethodDemo {
	public static void main(String[] args) {
	
		//new thread should create a new thread with some object as well.
		//since each new thread should pass same object and diff name?

		aDisplay d = new aDisplay();
		anewThread nt = new anewThread(d,"Dhoni");
		anewThread nt2 = new anewThread(d,"Virat");

		nt.start();
		nt2.start();
	
	}

}
