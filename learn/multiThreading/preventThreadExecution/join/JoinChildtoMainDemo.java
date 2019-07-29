package learn.multiThreading.preventThreadExecution.join;

class childThread extends Thread{
		
		//create a static variable type Thread mt
		public static Thread mt;
	
		public void run(){
		try {
			mt.join(); //main has to complete first
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread");

		for (int i =0; i<10;i++) {
			System.out.println("child-"+i);
		}
		
		
		
	}
}

public class JoinChildtoMainDemo {

	public static void main(String[] args) {
	
		//assign mt to main thread
		childThread.mt = Thread.currentThread();
		
		childThread t = new childThread();
		t.start();
		
		for (int i =0; i<10;i++) {
			System.out.println("main-"+i);
		}
		
	}

}

/*
main-0
main-1
main-2
main-3
main-4
main-5
main-6
main-7
main-8
main-9
Child Thread
child-0
child-1
child-2
child-3
child-4
child-5
child-6
child-7
child-8
child-9
*/