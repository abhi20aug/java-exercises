package learn.multiThreading.ThreadPriority;

class childThread extends Thread {
	public void run(){
		
		for (int j=0; j<10; j++)
		{
			System.out.println("child t:"+j);
		}
		
	}
}

public class testPriority {

	public static void main(String[] args) {
		childThread c = new childThread();
		c.setPriority(10);
		c.start();
		System.out.println(c.getPriority());
		
		for (int k=0; k<100; k++)
		{
			System.out.println("main t "+k);
		}		
	}

}
