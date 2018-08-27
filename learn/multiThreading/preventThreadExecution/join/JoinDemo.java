package learn.multiThreading.preventThreadExecution.join;


//t1-> wants to wait till t2 complete, then call t2.join inside t1
class t1 extends Thread{
	public void run(){
		System.out.println("t1");
		for (int t=0; t< 10; t++ )
		{
			System.out.println("t1: "+t);
			if (t==1)
			{
				try {
					sleep(2000);
				} catch (InterruptedException e) {
				}
			} 
		}
		System.out.println("t1-complete");
	}
}

public class JoinDemo {

	public JoinDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		t1 tt1 = new t1();
		tt1.start();
		
		//main  thread is executing here
		//so main thread has to wait till t1 complete.
		try {
			tt1.join();
			System.out.println("Main completed case-1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main case-1 ends******");		
		System.out.println("Main case-2 Starts****");

		t1 ta1 = new t1();
		ta1.start();
		
		//main  thread is executing here
		//so main thread has to wait till t1 complete.
		try {
			ta1.join(1000);
			System.out.println("Main completed: case-2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
