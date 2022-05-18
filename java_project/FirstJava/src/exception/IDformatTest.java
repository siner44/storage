package exception;

public class IDformatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDformatException {

		if (userID == null) {
			throw new IDformatException("아이디는 null 일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDformatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}

		this.userID = userID;
	}

	public static void main(String[] args) {

		IDformatTest idTest = new IDformatTest();
		String userID = null;

		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e);
		}

		userID = "1234567";

		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}

	}

}
