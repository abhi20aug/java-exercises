package learn.multiThreading;

public class TestExtendThread {

	public static void main(String[] args) {

		System.out.println("Main Thread");
		System.out.println("Name of Thread is " + Thread.currentThread().getName());

		//create a new child thread from class
		ExtendThread t = new ExtendThread();
		//starting of a thread
		//register with threadscheduler and 
		//perform mandatory activities.
		//heart of multi threading
		t.start(); 
		//t.run(); //if called no new thread is created, will continue to use main
		System.out.println(t.getName());
		
		//below executed by main thread
		for (int i=0; i<10; i++)
		{
			System.out.println("Main Thread Test");
		}
	}

}
