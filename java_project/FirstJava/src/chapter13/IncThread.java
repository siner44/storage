package chapter13;

public class IncThread {

	Increment inc;

	public IncThread(Increment inc) {
		this.inc = inc;
	}

	private void run() {
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) {
				inc.increment();
			}
		}

	}

}
