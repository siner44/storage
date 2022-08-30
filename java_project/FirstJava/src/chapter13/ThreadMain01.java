package chapter13;

public class ThreadMain01 extends Thread{
	public ThreadMain01(String threadname) {
		super(threadname);
	}
	
	public void run() {
		Thread t = currentThread();
		System.out.println("실행 스레드:" + t);
		
		for(int i = 0; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("스레드 이름: %s,", currentThread().getName());
			System.out.printf("temp value: %d%n", i);
		}
	}
	public static void main(String[] args) {
		ThreadMain01 tm = new ThreadMain01("첫째");
		tm.start();
	}
}
