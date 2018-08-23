package learn.multiThreading;

public class ExtendThread extends Thread{

	public ExtendThread() {
		// TODO Auto-generated constructor stub
	setName("child");	
	//System.out.println(getName());
	}

	
	public void run()
	{
		//job of thread
		for (int i=0; i<10; i++)
		{
			System.out.println("Child Thread Test");
		}
	}
	
	//overloading
	public void run(int j)
	{
		//job of thread
		for (int i=0; i<10; i++)
		{
			System.out.println("Child Thread overloading Test"+j);
		}
	}

	
}
