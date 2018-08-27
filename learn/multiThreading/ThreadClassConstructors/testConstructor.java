package learn.multiThreading.ThreadClassConstructors;

class demoConstructor extends Thread {
	
	public void run()
	{
		System.out.println("child thread");
	}
}

class testConstructor{	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("abhishek main thread");
		System.out.println(Thread.currentThread().getName());
		
		
		demoConstructor r = new demoConstructor();
		Thread t1 = new Thread(r); //passed parameters as Target Runnable
		t1.start();
		for (int k=0; k< 5; k++)
		{
		System.out.println("Main"+k);	
		}
		}

}


