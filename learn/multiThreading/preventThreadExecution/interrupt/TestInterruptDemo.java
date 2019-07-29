package learn.multiThreading.preventThreadExecution.interrupt;

class myThread extends Thread{
	public void run () {
		System.out.println("");
	
		try {

			for(int i=0;i<10;i++)
			{
				System.out.println("Lazy Thread"+i);
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			System.out.println("got interrupted");
			//e.printStackTrace();
		}
	}

}

public class TestInterruptDemo {
	public static void main(String[] args) {

		myThread t = new myThread();
		t.start();
		
		//add interruption, main thread interrupt child thread
		t.interrupt();
		
		System.out.println("end of main");
		
	}

}
