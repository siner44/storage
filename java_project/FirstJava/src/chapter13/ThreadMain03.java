package chapter13;

public class ThreadMain03 implements Runnable{

	@Override
	public void run() {
		System.out.println("run 메소드, 스레드 이름: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("main 메소드, 스레드 이름: " + Thread.currentThread().getName());
		
		ThreadMain03 tm = new ThreadMain03();
		Thread t = new Thread(tm);
		t.start();
	}
}
