package learn.multiThreading.implementRunnable;

public class TestMainThread {

	public static void main(String[] args) {
		
		ImplementRunnableTest r = new ImplementRunnableTest();
		//who has start capability?
		//r.start?
		Thread t1 = new Thread(r); //passed parameters as Target Runnable
		t1.start();
		//start method to call run method
		//Thread class run method has empty implement so, target runnable is passed.
		
		for (int k=0; k< 10; k++)
		{
		System.out.println("Main Thread"+k);	
		}
		}

}
