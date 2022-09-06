package thread;

public class BeepPrintEx {
	public static void main(String[] args) {
		BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("비프음");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
