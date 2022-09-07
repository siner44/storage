package thread;

public class YieldEx {
	public static void main(String[] args) {
		Thread01 threadA = new Thread01();
		Thread02 threadB = new Thread02();
		
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(5000); }catch(InterruptedException e) {}
		threadA.work= false;
		
		try { Thread.sleep(5000); }catch(InterruptedException e) {}
		threadA.work= true;
		
		try { Thread.sleep(5000); }catch(InterruptedException e) {}
		threadA.stop= true;
		threadB.stop= true;
	}
}
