package chapter13;

public class CountDownThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			
			if(ThreadTest4.inputCheck) {
				System.out.println("데이터 입력이 완료되어 카운트다운을 멈춤니다.");
				return;
			}
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("10초동안 입력이 없어 프로그램을 종료합니다.");
		System.exit(0);
	}
	
	
}
