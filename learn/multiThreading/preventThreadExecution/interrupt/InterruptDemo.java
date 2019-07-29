package learn.multiThreading.preventThreadExecution.interrupt;

class childThread extends Thread{
	
	public void run() {
		
		for(int i=0; i<10000;i++)
		{
			System.out.println("count"+i);
		}
		
		try {
			System.out.println("going into sleep");
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	
}

public class InterruptDemo {
	public static void main(String[] args) {
			childThread t = new childThread();
			t.start();
			t.interrupt();
			System.out.println("end of all");
	}
}


/*
count9998
count9999
going into sleep
Interruped
*/

//if target thread does not go into sleep anytime, then only interrupt call is wasted