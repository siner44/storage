package chapter13;

class MyRunnable implements Runnable{

	@Override
	public void run() {System.out.println("run"); first();}

	private void first() {System.out.println("first"); second();}

	private void second() {System.out.println("second");}
	
}

public class ThreadMain05 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start");
		MyRunnable m = new MyRunnable();
		Thread myThread = new Thread(m);
		myThread.start();
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " end");
	}
}
