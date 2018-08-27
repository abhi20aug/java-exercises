package learn.multiThreading.ThreadPriority;

//private class
class ThreadPriority implements Runnable {
	public void run(){
		Thread.currentThread().setPriority(10);
		ThreadLowPriority r = new ThreadLowPriority();
		Thread t = new Thread(r);
		t.start();
		System.out.println("ThreadPriority t.getPriority()"+t.getPriority());
		System.out.println("ThreadPriority Thread.currentThread().getPriority(): "+Thread.currentThread().getPriority());

	}
}

class ThreadLowPriority implements Runnable {
	public void run(){
		System.out.println("ThreadLowPriority running");
		System.out.println("ThreadLowPriority priority : "+Thread.currentThread().getPriority());
		
	}
}

public class TestThreadPriority {

	public static void main(String[] args) {
		
		ThreadPriority r = new ThreadPriority();
		Thread t = new Thread(r);
		t.setPriority(10);
		t.start();
		System.out.println("ThreadPriority priority: "+t.getPriority());
		System.out.println("Main running");
		
	}

}

// priority is 1 to 10 its not array index
// 1  is min prioroty
// 10 is max priority
// Thread.MIN_P =1
// Thread.NORM_P =5
// Thread.MAX_p =10
