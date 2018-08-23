package learn.multiThreading.implementRunnable;

public class TestMainThread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();

		System.out.println(t);
		t.setName("MainThreadCustomName");
		System.out.println(t.getName());
		
		//sleep
		
		try {
			for (int n=1; n<=5;n++)
			{
				System.out.println("n: "+n);
				t.sleep(1000);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Program finished");
		}

	}

}
