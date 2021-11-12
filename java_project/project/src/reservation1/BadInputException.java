package reservation1;


public class BadInputException extends Exception {

	public BadInputException() {
		super("(잘못 입력하셨습니다.)");
	}
}
