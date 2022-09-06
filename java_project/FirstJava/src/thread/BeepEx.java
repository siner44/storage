package thread;

import java.awt.Toolkit;

public class BeepEx {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 출력
			try {
				Thread.sleep(500); // 0.5초대기
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("비프음"); // 비프음 문자열 출력
		}
		try {
			Thread.sleep(500); // 0.5초대기
		} catch (Exception e) {

		}
	}
}
