package learn.multiThreading.implementRunnable;

public class ImplementRunnableTest implements Runnable {

	//job of a thread
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i< 10;i++)
		{
			System.out.println("child thread"+i);
			
		}

	
	}

}
