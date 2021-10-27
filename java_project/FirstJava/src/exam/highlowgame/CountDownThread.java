package exam.highlowgame;

public class CountDownThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 20; i > 0; i--) {
			
			if(HighLowGame.inputCheck) {
				System.out.println("정답 입력이 완료되어 카운트다운을 멈춤니다.");
				return;
			}
			System.out.println(i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("10초안에 맞추지 못해 프로그램을 종료합니다.");
		System.exit(0);
	}
	
	
}
