package learn.multiThreading.threadClass;

public class TestOverloadingExtendThread {


	public static void main(String[] args) {

		ExtendThread t = new ExtendThread();	
		t.start();
		System.out.println("Current Thread Name:"+t.getName());
	
		System.out.println("Current Thread Name:"+Thread.currentThread().getName());
		t.run(1);

	}

}
