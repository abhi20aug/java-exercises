package learn.multiThreading;

public class ImplementRunnableTest implements Runnable {

	Thread t;
	//constructor
	ImplementRunnableTest(){
		t = new Thread(this,"NewT");
		System.out.println(t);
		t.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		

	
	}

}
