package test_platform;

public class Newthread extends Thread {
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e) {}
		for(int i=0;i<10;i++) {
			System.out.println("child");
		}
	}
}
class ThreadDemo
{
public static void main(String[] args)throws InterruptedException 
{
	Newthread.mt = Thread.currentThread();
	Newthread t = new Newthread();
	t.start();
	t.join();
	for(int i=0;i<10;i++) {
		System.out.println("main");
		Thread.sleep(2000);
	}
}
}
