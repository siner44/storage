package chapter13;

public class ThreadMain02 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.printf("스레드 이름: %s,", Thread.currentThread().getName());
			System.out.printf("temp value: %d%n", i);
		}
	}
	
	public static void main(String[] args) {
		ThreadMain02 tm = new ThreadMain02();
		Thread t = new Thread(tm, "첫째");
		t.start();
	}
	
}
