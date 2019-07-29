package learn.multiThreading.preventThreadExecution.sleep;

class childThread extends Thread{
	
	//define a static variable, that load on class call
	public static Thread mt;
	
	public void run() {
		System.out.println("child-thread starts");
		try {
			mt.join(); //it will cause current thread to wait till main thread is complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("child running "+i);
		}
		
	}
}

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {

		//Thread does want to perform any operation for particular amt of time
		//then use sleep.
		
		//call and load current threas in mt static var.
		childThread.mt = Thread.currentThread();
		
		childThread ct = new childThread();
		ct.start();
		
		//main thread
		for(int i=0;i<10;i++) {
			System.out.println("Main running "+i);
			Thread.sleep(2000);
			
		}
		
	}

}
