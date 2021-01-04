package test_platform;

public class thread1 extends Thread {

	public void run() {
		for(int i=0;i<10;i++)
		{

		System.out.println("child process");
		Thread.yield();
	}
	}
}
class Yieldthread{
	public static void main(String[] args) {
		thread1 t = new thread1();
		t.start();
		for(int i=0;i<10;i++)
		System.out.println("main method");

	}

}
