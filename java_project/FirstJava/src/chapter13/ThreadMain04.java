package chapter13;

public class ThreadMain04 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 이름: " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadMain04 tm = new ThreadMain04();
		Thread t1 = new Thread(tm,"첫번째");
		t1.start();
		Thread t2 = new Thread(tm,"두번째");
		t2.start();
		Thread t3 = new Thread(tm,"세번째");
		t3.start();
	}
}
