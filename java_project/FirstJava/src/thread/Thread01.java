package thread;

public class Thread01 extends Thread{
	public boolean stop = false; //종료 플래그
	public boolean work = true; //작업 진행 여부 플래그
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
