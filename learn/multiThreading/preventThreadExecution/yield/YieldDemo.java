package learn.multiThreading.preventThreadExecution.yield;

class lessExecutionTimethread extends Thread
{
	public void run() {
	}
}


class highExecutionTimethread extends Thread
{
	//add yield method : causes execution for waiting thread execution
	//yield
	//1. t1 p10 exetime: 100 hr
	//2. t2 p09 exetime: 1 sec
	//3. t3 p10 exetime: 2 sec 
	//t3 will get chance in between (?) while t1 executes. also depends on thread scheduler
	public void run() {
		System.out.println("High Execution Time");
		for ( int j=0; j<10;j++)
		{
		System.out.println("HET"+j);
		Thread.yield();
		}
		
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		highExecutionTimethread ht = new highExecutionTimethread();
		ht.start();
		for ( int j=0; j<10;j++)
		{
		System.out.println("Main Thread-"+j);
		}
	}

}
